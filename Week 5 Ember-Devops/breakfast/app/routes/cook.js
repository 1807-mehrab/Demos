import Route from '@ember/routing/route';

export default Route.extend({
    actions: {
        cookFoodItem: function() {
            var cook = this.store.createRecord('cook', {
                name: this.controller.get('foodItem')
            });
            cook.save().then(
                () => {
                    alert('save successful');
                }
            )
        }
    }
});
