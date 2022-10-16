10/12 (수)
---
05장에서 인스턴스를 가리키는 변수가 참조 변수이며, 참조 변수를 출력하면 '클래스이름@메모리 주소' 문자열 값이 나온다고 했다. (p.150)

```java
class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {

    public static void main(String[] args) {
        BirthDay bDAy = new BirthDay();
        bDAy.setYear(2000);
        System.out.println(bDAy);
        bDAy.printThis();
    }
}
```
```dtd
출력결과 >>
Chapter06.BirthDay@3ac3fd8b
Chapter06.BirthDay@3ac3fd8b
```
출력 결과를 보면 bDay.printThis() 메서드를 호출하여 출력한 this 값이 참조 변수 bDay를 출력한 값과 같다.
즉 클래스 코드에서 사용하는 this는 생성된 인스턴스 자신을 가리키는 역할을 한다. 따라서 this.year = year; 문장으로 참조하면 동적 메모리(힙 메모리)에 생성된 인스턴스의 year 변수 위치를 가리키고 그 위치에 매개변수 값을 넣어 주는 것이다.
![img.png](img.png)

**주의**
```java
class Person {
    String name;
    int age;
    
    Person() {
        // this.name = name;    *에러남*
        this("이름 없음", 1);
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```
생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있다.
즉 디폴드 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하므로, 이때는 this를 활용한 문장이 가장 먼저 와야 한다.

```java
package Chapter06;

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf();
        System.out.println(p);
        System.out.println(noName);
    }
}


class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() {
        return this;    // this 반환
    }
}

```
```dtd
출력결과 >>
이름 없음
1
Chapter06.Person@3ac3fd8b
Chapter06.Person@3ac3fd8b
```
클래스 자료형과 상관없이 클래스 내에서 this를 사용하면 자신의 주소 값을 반환할 수 있다.

[참조] <br>
https://yaboong.github.io/java/2018/05/26/java-memory-management/ <br>
http://ojc.asia/bbs/board.php?bo_table=LecJava&wr_id=520

## 10/16 (일)
###static 변수란?<br>
- 다른 용어로 `정적 변수` 라고도 한다.
- 클래스 내부에 선언하지만, 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당된다.
  - 일반 멤버 변수는 인스턴스가 생성될 때마다 새로 생성되지만, static으로 선언한 변수는 인스턴스 생성과 상관없이 먼저 생성되고 그 값을 모든 인스턴스가 공유하게 된다.
- 값은 모든 인스턴스가 공유한다.
- static 변수를 클래스에 기반한 변수라고 해서 `클래스 변수`라고도 한다.

![img_1.png](img_1.png)
static으로 선언한 serialNum 변수는 모든 인스턴스가 공유하기 때문에 두 개의 참조변수가 동일한 변수의 메모리를 가리킨다.

####클래스 메서드
- static 변수를 위한 메서드 `static 메서드` 또는 `클래스 메서드`라고 한다.

```java
package Chapter06.staticEx;

public class Student2 {
    private static int serialNum = 1000;
    public String studentName;
    

    public static int getSerialNum() {
        int i = 10;
        studentName = "이지원";    // 오류 발생
        return serialNum;
    }

}
```
`getSerialNum()`메서드는 static 예약어를 붙인 클래스 메서드이다.
- int i = 10;
    - 이 변수는 메서드 내부에서 선언했다. `지역 변수`이다. 지역 변수는 메서드가 호출될 때 메모리에 생성되어 메서드가 끝나면 사라지는 변수이다. 따라서 getSerialNum() 메서드 내부에서만 사용이 가능하다.
    
- return serialNum;
    - serialNum 변수는 static 변수이다. 그러므로 클래스 메서드인 getSerialNum() 메서드 내부에서도 사용이 가능하다.
    
- studentName = "이지원";
    - 이 변수는 Student2클래스의 멤버 변수로, 인스턴스가 생성될 때 만들어지는 인스턴스 변수이기 때문에 오류가 발생한다.
    
> 정리: 클래서 메서드(`getSerialNum()`) 내부에서 지역 변수(`int i = 10`)와 클래스 변수(`serialNum`)는 사용할 수 있지만 인스턴스 변수(`studentName`)은 사용할 수 없다. 
> <br>반대로 일반 메서드에서 클래스 변수를 사용하는 것은 전혀 문제가 되지 않는다. <br>
> 왜냐하면, 일반 메서드는 인스턴스가 생성될 때 호출하는 메서드이고, 클래스 변수는 이미 만들어진 변수이기 때문에 일반 메서드에서도 클래스 변수를 호출할 수 있다.
