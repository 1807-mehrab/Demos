import DS from 'ember-data';

export default DS.JSONAPIAdapter.extend({
    host: 'http://jsonapiplayground.reyesoft.com/v2'
});
