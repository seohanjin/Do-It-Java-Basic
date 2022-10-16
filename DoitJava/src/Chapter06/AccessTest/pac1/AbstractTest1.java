package Chapter06.AccessTest.pac1;

public class AbstractTest1 extends AbstractAccessV1{

    public static void main(String[] args) {
        // default, protected 두 개 모두 상속관계에서 접근이 가능하다.
        AbstractTest1 abstractTest1 = new AbstractTest1();
        abstractTest1.protected1 = 1;
        abstractTest1.default1 = 1;

        abstractTest1.proMethod1();
        abstractTest1.defMethod1();
    }
    @Override
    protected void proMethod1() {
        System.out.println("Call Abstract Protected Method");
    }

    @Override
    protected void defMethod1() {

    }

    @Override
    public void pubMethod1() {
        System.out.println("Call Abstract Public Method");
    }
}
