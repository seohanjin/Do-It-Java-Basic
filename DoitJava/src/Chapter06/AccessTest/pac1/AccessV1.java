package Chapter06.AccessTest.pac1;

public class AccessV1 {
    private int private1;
    protected int protected1;
    int default1;
    public int public1;

    private void priMethod1() {
        System.out.println("Call PriMethod1");
    }

    protected void proMethod1() {
        System.out.println("Call ProtectedMethod1");
    }

    void defMethod1() {
        System.out.println("Call DefaultMethod1");
    }

    public void pubMethod1() {
        System.out.println("Call PublicMethod1");
    }
}
