package th.co.geniustree.test.flexibledesign.shipping;

public interface Validator<T> {
    boolean validate(T t);
}
