10/27 (목)
---
### 상위 클래스 변수를 사용하기 위한 protected 예약어
상위 클래스에 작성한 변수나 메서드 중 외부 클래스에서 사용할 수 없지만 하위 클래스에서는 사용할 수 없도록 지정하는 예약어가 바로 `proected`이다.<br>
즉, `protected`는 상속된 하위 클래스를 제외한 나머지 외부 클래스에서는 `private`과 동일한 역할을 한다.

### 상속에서 클래스 생성과 형 변환
하위 클래스가 생성될 때는 상위 클래스의 생성자가 먼저 호출된다.

```java
public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
>>>
Customer() 생성자 호출
VIPCustomer() 생성자 호출
김유신 님의 등급은 VIP이며, 보너스 포인트는10000입니다.
```
상위 클래스의 Customer() 생성자가 먼저 호출되고 그 다음에 VIPCustomer()가 호출되는 것을 알 수 있다.
![img_2.png](img_2.png)

### 부모를 부르는 예약어, super
```java
public VIPCustomer() {
    super();
    customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
    bonusRatio = 0.05;  // 보너스 적립 5%
    saleRatio = 0.01;   // 할인율 10%
    System.out.println("VIPCustomer() 생성자 호출");
}
```
컴파일러가 자동으로 추가하는 코드이다. (super)
상위 클래스의 Customer()가 호출된다.
