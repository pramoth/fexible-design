package th.co.geniustree.test.flexibledesign.shipping.impl;

import th.co.geniustree.test.flexibledesign.domain.Product;
import th.co.geniustree.test.flexibledesign.shipping.Shipping;

public class ShipOnlyProductWithBrand<T extends Product> implements Shipping<T> {
    //override ship(T) save product's id,name,brand (mimic save by print out)
    @Override
    public void ship(T t) {
        System.out.println(t.getId());
        System.out.println(t.getName());
        //How I print brand
        //TODO
        System.out.println(t.getBrand());
    }

}
