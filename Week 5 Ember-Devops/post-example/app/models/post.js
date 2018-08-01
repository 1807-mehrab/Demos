import DS from 'ember-data';
import attr from 'ember-data/attr';

export default DS.Model.extend({
    userId: DS.belongsTo('user'),
    title: attr('string'),
    body: attr('string')
});
