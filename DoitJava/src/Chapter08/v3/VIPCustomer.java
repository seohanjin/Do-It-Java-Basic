package Chapter08.v3;

public class VIPCustomer extends Customer {

    private int agentID;    // VIP 고객 담당 상담원 아이디
    double saleRatio;       // 할인율

    public VIPCustomer() {
        super();
        customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
        bonusRatio = 0.05;  // 보너스 적립 5%
        saleRatio = 0.01;   // 할인율 10%
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
        bonusRatio = 0.05;  // 보너스 적립 5%
        saleRatio = 0.01;   // 할인율 10%
        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
