package th.co.geniustree.test.flexibledesign.shipping.impl;

import org.junit.Test;
import th.co.geniustree.test.flexibledesign.domain.Coke;
import th.co.geniustree.test.flexibledesign.domain.Milk;

public class ShipOnlyProductWithBrandTest {
    @Test
    public void test(){
        ShipOnlyProductWithBrand productWithBrandShipping = new ShipOnlyProductWithBrand();
        productWithBrandShipping.ship(new Milk());
        productWithBrandShipping.ship(new Coke());
    }
}
