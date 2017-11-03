import Route from '@ember/routing/route';
import mockTodoList from "../models/todoTest";

let todoList = mockTodoList;



export default Route.extend({
  model() {
    return todoList;
  }
});
