package Chapter08.v1;

public class VIPCustomer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    private int agentID;    // VIP 고객 담당 상담원 아이디
    double saleRatio;       // 할인율

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;  // 보너스 적립 5%
        saleRatio = 0.01;   // 할인율 10%
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);    // 할인율 적용
   }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }
}
