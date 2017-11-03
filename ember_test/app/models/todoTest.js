import EmberObject from '@ember/object';

const Todo = EmberObject.extend({
  id: null,
  idList: 1,
  text: null
});

let todo1 = Todo.create({
  id: '1',
  text: 'Laver le tapis'
});

let todo2 = Todo.create({
  id: '2',
  text: 'Vérifier les ampoules du lustres'
});

let todo3 = Todo.create({
  id: '3',
  text: 'Faire projet Jahia'
});

let todo4 = Todo.create({
  id: '4',
  text: 'Dire à Dany qu\'il ronfle'
});

let MockTodoList = [todo1, todo2, todo3, todo4];

export default MockTodoList;
