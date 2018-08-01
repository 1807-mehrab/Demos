import DS from 'ember-data';
import attr from 'ember-data/attr';

export default DS.Model.extend({
    name: attr('string'),
    email: attr('string'),
    phone: attr('string'),
    website: attr('string'),
    post: DS.hasMany('post')
});
