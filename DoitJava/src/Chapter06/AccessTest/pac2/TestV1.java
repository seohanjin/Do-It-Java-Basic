package Chapter06.AccessTest.pac2;

import Chapter06.AccessTest.pac1.AccessV1;

public class TestV1 {
    public static void main(String[] args) {
        // 다른 패키지 클래스는 public만 접근이 가능하다.
        AccessV1 accessV1 = new AccessV1();

        accessV1.public1 = 1;
        accessV1.pubMethod1();
    }
}
