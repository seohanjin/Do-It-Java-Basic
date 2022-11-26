package Chapter13.v1;

class OuterV4 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                // num = 200;
                // i = 10;
                System.out.println(i);
                System.out.println(num);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}
public class AnonymousInnerTestV4 {
    public static void main(String[] args) {
        OuterV4 out = new OuterV4();
        Runnable runnable = out.getRunnable(10);
        runnable.run();
        out.runner.run();
    }
}
