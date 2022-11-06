package Chapter08.v4;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10010, "Kim", 100);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());

        Customer customerWho = new VIPCustomer(10010, "Who", 100);
        int price = customerWho.calcPrice(10000);
        customerWho.showCustomerInfo();
    }

}
