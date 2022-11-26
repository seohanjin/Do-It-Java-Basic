package Chapter13.v1;

class OutClassV2 {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {        // 정적 내부 클래스
        int inNum = 100;                // 정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200;        // 정적 내부 클래스의 정적 변수

        // 정적 내부 클래스의 일반 메서드
        void inTest() {
//            num += 10;                // 외부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
            System.out.println("InStaticClass inNum = " + inNum + "(외부 클래스의 인스턴스 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(외부 클래스의 인스턴스 변수)");
            System.out.println("InStaticClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

        static void sTest() {
//            num += 10;                // 외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없다.
//            inNum += 10;              // 외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없다.
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 인스턴스 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(외부 클래스의 인스턴스 변수)");
        }
    }
}

public class InnerTestV2 {
    public static void main(String[] args) {
        OutClassV2.InStaticClass sInClass = new OutClassV2.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();

        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClassV2.InStaticClass.sTest();
    }
}
