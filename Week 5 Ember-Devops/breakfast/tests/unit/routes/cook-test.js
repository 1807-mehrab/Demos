import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | cook', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:cook');
    assert.ok(route);
  });
});
