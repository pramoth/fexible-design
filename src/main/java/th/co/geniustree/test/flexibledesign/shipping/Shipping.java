package th.co.geniustree.test.flexibledesign.shipping;

import th.co.geniustree.test.flexibledesign.domain.Product;

public interface Shipping<T> {
    public void ship(T t);
}
