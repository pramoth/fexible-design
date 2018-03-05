package th.co.geniustree.test.flexibledesign.domain;

import java.math.BigInteger;
import java.time.LocalDate;

public class Milk implements Product,WithExpiry,WithTemperatureLimit,WithBrand {
    @Override
    public BigInteger getId() {
        return new BigInteger("1");
    }

    public String getName() {
        return "Milk";
    }

    public LocalDate getExpiry() {
        return LocalDate.of(2019,01,01);
    }

    public Double getMaxCelsius() {
        return 40.0;
    }

    public Double getMinCelsius() {
        return 0.0;
    }

    @Override
    public String getBrand() {
        return "Dutch Milk";
    }
}
