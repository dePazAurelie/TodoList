import Route from '@ember/routing/route';
import mockTodo from "../models/MockTodoList";

let todoList = mockTodo;

export default Route.extend({
  model() {
    return todoList;
  }
});
