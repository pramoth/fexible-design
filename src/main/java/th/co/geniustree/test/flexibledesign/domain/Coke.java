package th.co.geniustree.test.flexibledesign.domain;

import java.math.BigInteger;

public class Coke implements Product,WithBrand {
    @Override
    public BigInteger getId() {
        return new BigInteger("2");
    }

    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public String getBrand() {
        return "Coca Cola";
    }
}
