import DS from 'ember-data';

export default DS.Model.extend({
  id: DS.attr('string'),
  idList: DS.attr('string'),
  text: DS.attr('string')
});
