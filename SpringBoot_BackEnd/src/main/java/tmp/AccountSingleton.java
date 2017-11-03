package tmp;

import entity.Account;
import entity.Token;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountSingleton {
    private static AccountSingleton instance = new AccountSingleton();
    private List<Account> accounts = new CopyOnWriteArrayList<Account>();
    private List<Token> tokens = new CopyOnWriteArrayList<Token>();

    private AccountSingleton() {

    }

    public static AccountSingleton getInstance() {
        return instance;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Token> getTokens() {
        return tokens;
    }
}
