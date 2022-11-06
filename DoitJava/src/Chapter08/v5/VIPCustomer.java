package Chapter08.v5;

import Chapter08.v4.Customer;

public class VIPCustomer extends Customer {

//    private int agentID;    // VIP 고객 담당 상담원 아이디
//    double saleRatio;       // 할인율
//
//    public VIPCustomer() {
//        super();
//        customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
//        bonusRatio = 0.05;  // 보너스 적립 5%
//        saleRatio = 0.01;   // 할인율 10%
//    }
//    public VIPCustomer(int customerID, String customerName) {
//        super(customerID, customerName);
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//    }
//
//    public VIPCustomer(int customerID, String customerName, int agentID) {
//        super(customerID, customerName);
//        customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
//        bonusRatio = 0.05;  // 보너스 적립 5%
//        saleRatio = 0.01;   // 할인율 10%
//        this.agentID = agentID;
//    }
//
//    public int calcPrice(int price) {
//        System.out.println("VIPCustomer calcPrice()");
//        bonusPoint += price * bonusRatio;
//        return price;
//    }
//
//    public int getAgentID() {
//        return agentID;
//    }
}
