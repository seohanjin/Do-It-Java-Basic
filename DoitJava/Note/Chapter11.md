Object 클래스
---
Object 클래스는 모든 자바 클래스의 최상위 클래스이다.

```java
// 코드를 작성할 때
class Student {
    int studentId;
    String studentName;
}

// 컴파일러가 변환
class Student extends Object {
    int studentId;
    String studentName;
}
```
> ### toString() 메서드

`toString()`메서드는 인스턴스 정보를 문자열로 반환한느 메서드이다.
<br>
`toString()` 메서드의 원형은 생성된 인스턴스의 클래스 이름과 주소 값을 보여준다.
```java
getClass().getName() + '@' + Integer.toHexString(hashCode())
// 클래스 이름@해시 코드 값
```
### 예외
```java
String str = new String("test");
System.out.println(str);        // test

Integer i1 = new Integer(100);
System.out.println(i1);         // 100
```
이건 왜 `클래스이름@해시코드값`이 아닐까?<br>
: String과 Integer는 toString()메서드를 재정의해 두었기 때문!

> ### equals() 메서드
`equals()`메서드의 원래 기능은 두 인스턴스의 주소 값을 비교하여 `boolean` 값을 반환해 주는 것이다.<br>
주소 값이 같다면 같은 인스턴스이다. 그런데 서로 다른 주소 값을 가질 때도 같은 인스턴스라고 정의할 수 있는 경우가 있다.<br>
따라서 `물리적 동일성(인스턴스의 메모리 주소가 같음)`뿐 아니라 `논리적 동일성(논리적으로 두 인스턴스가 같음)`을 구현할 때도 equals()메서드를 재정의하여 사용한다.

>### hashCode() 메서드
`해시(hash)`는 정보를 저장하거나 검색할 때 사용하는 자료 구조 이다.<br>
정보를 어디에 저장할 것인지, 어디서 가져올 것인지 해시 함수를 이용하여 구현한다. 해시 함수는 객체의 특정 정보(키 값)를 매개변수 값으로 넣으면 그 객체가 저장되어야 할 위치나 저장된 해시 테이블 주소(위치)를 반환한다. 따라서 객체 정보를 알면 해당 객체의 위치를 빠르게 검색할 수 있다.
<br><br>
자바에서는 인스턴스를 힙 메모리에 생성하여 관리할 때 해시 알고리즘을 사용한다.
```java
hashCode = hash(key);   // 객체의 해시 코드 값(메모리 위치 값)이 반환됨
```
Object클래스의 toString() 메서드 원형을 다시 살펴보면 `getClass().getName() + '@' + Integer.toHexString(hashCode())`이다.
즉, 우리가 참조 변수를 출력할 때 본 16진수 숫자 값이 '해시 코드 값'이고, 이 값은 자바 가상 머신이 힙 메모리에 저장한 '인스턴스의 주소 값'이다.<br>
즉 자바에서는 두 인스턴스가 같다면 hashCode() 메서드에서 반환하는 해시 코드 값이 같아야 한다.

hashCode() 또한 String와 Integer 클래스에서는 재정의 되어있다.

> ### clone() 메서드

객체 원본을 유지해 놓고 복사본을 사용한다거나, 기본 틀의 복사본을 사용해 동일한 인스턴스를 만들어 복잡한 생성 과정을 간단히 하려는 경우이 `clone()`메서드를 사용할 수 있다.

String 클래스
---
```java
String str1 = new String("abc");    // 힙 메모리
String str2 = "test";               // 상수 풀
```

```java
String javaStr = new String("java");
String androidStr = new String("android");

javaStr = javaStr.concat(androidStr);
```
문자열은 불변하므로 javaStr 변수 값 자체가 변하는 것이 아니라 새로운 문자열이 생성된 것이다.

## StringBuffer와 StringBuilder 클래스 활용하기
String 클래스는 한번 생성되면 그 내부 문자열이 변경되지 않기 때문에 클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비된다.
이 문제를 해결하는 것이 `StringBuffer`와 `StringBuilder`클래스이다.

Wrapper 클래스
---
> ### Integer 클래스 사용하기

int 자료형을 감싼 클래스이다.

## Integer 클래스의 메서드
```java
Integer iValue = new Integer(100);
int myValue = iValue.intValue();    // int 값 가져오기. myValue 값을 출력하면 100이 출력됨
```