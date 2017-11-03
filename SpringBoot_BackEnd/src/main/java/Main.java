import entity.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tmp.AccountSingleton;

@EnableAutoConfiguration(exclude = {EmbeddedMongoAutoConfiguration.class,
        MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan(basePackages = {"configuration", "controller", "oauth"})
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
        AccountSingleton.getInstance().getAccounts()
                .add(new Account("test", "test", "test@test.fr"));
        //MongoSingleton.getInstance().config("localhost", 27017);
        //MongoSingleton.getInstance().setMongoDatabase("myDatabase");
    }
}
