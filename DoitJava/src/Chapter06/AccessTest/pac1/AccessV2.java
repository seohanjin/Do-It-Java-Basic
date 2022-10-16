package Chapter06.AccessTest.pac1;

public class AccessV2 {
    public static void main(String[] args) {
        AccessV1 accessV1 = new AccessV1();
        accessV1.public1 = 1;
        accessV1.protected1 = 1;
        accessV1.default1 = 1;

        accessV1.pubMethod1();
        accessV1.proMethod1();
        accessV1.defMethod1();
    }
}
