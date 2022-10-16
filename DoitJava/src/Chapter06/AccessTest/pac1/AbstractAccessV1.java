package Chapter06.AccessTest.pac1;

public abstract class AbstractAccessV1 {
    private int private1;
    protected int protected1;
    int default1;
    public int public1;

    private void priMethod1() {
        System.out.println("Call PriMethod1");
    }

    abstract void proMethod1();

    protected abstract void defMethod1();

    public abstract void pubMethod1();
}
