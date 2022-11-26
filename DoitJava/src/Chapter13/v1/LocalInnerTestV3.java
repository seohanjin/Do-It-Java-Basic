package Chapter13.v1;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;              // 지역 변수

        class MyRunnable implements Runnable {  // 지역 내부 클래스
            int localNum = 10;                  // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {     // 자바 스레드가 실행될 때 호출되는 run()메서드
                // num = 200;       // 지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                // i = 100;         // 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                System.out.println("i =" + i);
                System.out.println("num = " + num);
                System.out.println("localNum =" + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적변수)");
            }
        }

        return new MyRunnable();

        // 이 메서드의 반환형은 Runnable이다. 즉 이메서드에서는 Runnable 자료형의 객체를 생성하여 반환해야 한다.
    }
}
public class LocalInnerTestV3 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        // run 메서드는 getRunnable메서드의 지역변수인 i와 num을 가지고 있음에도 실행이된다. (메서드의 지역변수는 호출이 끝나면 스택에서 날라감)
        // 그 이유는    지역 내부 클래스에서 사용하는 지역 변수는 상수로 처리된다.
        // 지역 내부 클래스에서 사용하는 메서드의 지역 변수는 모두 상수로 바뀐다.
        runner.run();
    }
}
