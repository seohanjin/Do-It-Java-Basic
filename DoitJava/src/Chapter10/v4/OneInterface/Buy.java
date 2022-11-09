package Chapter10.v4.OneInterface;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("구매주문");
    }
}
