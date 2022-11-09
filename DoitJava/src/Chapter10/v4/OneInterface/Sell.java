package Chapter10.v4.OneInterface;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("판매 주문");
    }
}
