# 접근제어 테스트

> #### Test1) 서로 다른 패키지에 속해있는 2개 기본 클래스 AccessV1,Test1에 대한 접근제어 테스트
```java
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
```
```java
package Chapter06.AccessTest.pac2;

import Chapter06.AccessTest.pac1.AccessV1;

public class TestV1 {
    public static void main(String[] args) {
        AccessV1 accessV1 = new AccessV1();

        accessV1.public1 = 1;
        accessV1.pubMethod1();
    }
}
```
> 결과<br>
서로 다른 2개의 패키지 안에 있는 클래스에 객체를 생성했을 때는 `public`만 접근이 가능하다.

---
> #### Test2) 추상클래스와 같은 패키지에 클래스 접근제어 테스트
```java
package Chapter06.AccessTest.pac1;

public abstract class AbstractAccessV1 {
    private int private1;
    protected int protected1;
    int default1;
    public int public1;

    private void priMethod1() { // 추상메서드는 오버라이딩을 전제로 하기 때문에 private으로 선언할 수 없다.
        System.out.println("Call PriMethod1");
    }

    abstract protected void proMethod1();

    protected abstract void defMethod1();

    public abstract void pubMethod1();
}
```
```java
//같은 패키지 자식 클래스
package Chapter06.AccessTest.pac1;

public class AbstractTest1 extends AbstractAccessV1{

    public static void main(String[] args) {
        AbstractAccessV1 accessV1 = new AbstractTest1();
        accessV1.public1 = 1;
        accessV1.protected1 = 1;
        accessV1.default1 = 1;

        accessV1.pubMethod1();
        accessV1.proMethod1();
        accessV1.defMethod1();
    }
    @Override
    protected void proMethod1() {
        System.out.println("Call Abstract Protected Method");
    }

    @Override
    protected void defMethod1() {
        System.out.println("Call Abstract Default Method");
    }

    @Override
    public void pubMethod1() {
        System.out.println("Call Abstract Public Method");
    }
}
```
#### `private`를 제외한 모든 접근제어자에 접근이 가능한다.

> `default`와 `protected`의 차이점? <br>
> ###default : 같은 패키지 내부에서만 접근할 수 있다.
> ###protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근할 수 있다.
> 그러면 `default`는 상속 관계에서는 접근 할 수 없을까?

```java
package Chapter06.AccessTest.pac1;

public class AbstractTest1 extends AbstractAccessV1{

    public static void main(String[] args) {
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
```
### 결론: 상속관계에서는 `default`, `protected`둘 다 접근 가능하다.