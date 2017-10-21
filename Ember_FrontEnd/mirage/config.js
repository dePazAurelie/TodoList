export default function() {
  this.namespace = '/api';

  this.get('/todos', function() {
    return {
      data: [{
        id: '1',
        list: '1',
        text: 'Laver le tapis'
      }, {
        id: '2',
        list: '1',
        text: 'Vérifier les ampoules du lustres'
      }, {
        id: '3',
        list: '1',
        text: 'Faire projet Jahia'
      }, {
        id: '4',
        list: '1',
        text: 'Dire à Dany qu\'il ronfle'
      }
    ]}
  });
}
