package Chapter05.method;

public class Test {

    int add(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    int getTenTotal() {
        int i;
        int total = 0;
        for (i = 0; i <= 10; i++) {
            total += i;
        }
        return total;   // 1부터 10까지 더한 값을 반환
    }

    void printGreeting(String name) {
        System.out.println(name + "님 안녕하세요");
        return;         // 반환 값 없음
    }

    void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("나누는 수는 0이 될 수 없습니다.");
            return;     // 함수 수행 종료
        }
        else {
            int result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + result + "입니다.");
        }
    }
}
