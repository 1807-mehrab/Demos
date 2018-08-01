import DS from 'ember-data';

export default DS.RESTAdapter.extend({
    host:'http://jsonplaceholder.typicode.com',
    pathForType() {return 'users';}
});
