제네릭
---
> ### 제네릭이란?

어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 `제네릭`프로그래밍 이라고 한다.<br>
제네릭 프로그램은 참조 자료형이 변환될 때 이에 대한 검증을 컴파일러가 하므로 안정적이다.

#### 자료형 매개변수 T와 static
static변수는 인스턴스 변수가 생성되기 이전에 생성된다. 또한 static 메서드에서는 인스턴스 변수를 사용할 수 없다.
그런데 T의 자료형이 정해지는 순가은 제네릭 클래스의 인스턴스가 생성되는 순간이다. 따라서 T의 자료형이 결정되는 시점보다 빠르기 때문에 static변수의 자료형이나 static메서드 내부 변수의 자료형으로 T를 사용할 수 없다.

컬렉션 프레임워크
---
> ### 컬렉션 프레임워크란?

자료 구조는 프로그램 실행 중 메모리에 자료를 유지, 관리하기 위해 사용한다.<br>
자바에서는 필요한 자료 구조를 미리 구현하여 java.util 패키지에서 제공하고 있는데, 이를 프레임워크라고 한다.

컬렉션 프레임워크의 전체 구조는 Collection 인터페이스와 Map 인터페이스 기반으로 이루어져 있습니다.

> ### Collection 인터페이스

- `List 인터페이스`: 순서가 있는 자료 관리, 중복 허용이 있음 / ArrayList, Vector, LinkedList, Stack, Queue 등이 있음
- `Set 인터페이스`: 순서가 정해져 있지 않음, 중복 허용 x / HashSet, TreeSet 등이 있음

> ### Map 인터페이스

하나가 아닌 쌍으로 되어 있는 자료를 관리하는 메서드들이 선언되어 있다.

> ### ArrayList와 Vector클래스

Vector는 자바 2 이전부터 제공했으며 ArrayList처럼 배열을 구현한 클래스이다.
ArrayList와 Vector의 가장 큰 차이는 동기화지원 여부이다.<br>
`동기화`란? 두 개 이상의 스레드가 동시에 Vector를 사용할 때 오류가 나지 않도록 실행 순서를 보장하는 것이다.

### 스레드와 멀티스레드 프로그래밍
스레드란 간단히 말하면 작업 단위이다.<br>
프로그램이 메모리에서 수행되려면 스레드 작업이 생성되어야 한다.
이 때 하나의 스레드만 수행되면 `단일 스레드`라 하고, 두 개 이상의 스레드가 동시에 실행되는 경우를 `멀티 스레드`라고 한다. 두 개 이상의 스레드가 동시에 실행되면 같은 메모리 공간에 접근하기 때문에 변수 값이나 메모리 상태에 오류가 생길 수 있다. 이때 메모리에 동시에 접근하지 못하도록 순서를 맞추는 것이 동기화이다.

> ### LinkedList

### 구조
링크드 리스트의 각 요소는 다음 요소를 가리키는 주소 값을 가진다. 따라서 물리적인 메모리는 떨어져 있어도 논리적으로는 앞뒤 순서가 있다.<br>
__같은 List 인터페이스를 구현한 ArrayList에 비해 중간에 자료를 넣고 제거하는 데 시간이 적게 걸린다는 장점이 있고,__ 크기를 동적으로 증가시킬 수 있다.<br>
링크드 리스트의 각 요소는 요소의 자료와 다음 요소의 주소를 저장하는 부분으로 구현된다.

### 배열과 링크드 리스트의 다른 점
배열은 생성할 때 용량을 지정하고, 용량보다 더 많은 요소가 추가된 경우에 용량을 늘려 가며 수행한다.<br>
그러나 링크드 리스트는 요소를 추가할 때마다 동적으로 요소의 메모리를 생성하기 때문에 배열처럼 용량을 늘리고 요소 값을 복사하는 번거로움이 없다.<br>
또한 링크드리스트는 자료를 중간에 추가하거나 삭제할 때 자료의 이동이 배열보다 적다.<br>
이런 면에서 링크드 리스트가 효율적인 경우가 있다.<br>
하지만, 배열이 링크드 리스트보다 효율적인 경우도 있다. 어떤 요소의 위치를 찾을 떄는 생각해보면, 배열은 물리적으로 연결된 자료 구조이므로 i번째 요소 메모리 위치를 바로 계산할 수 있어 접근이 빠르다.<br>
예를들어) int형 배열의 두 번째 자료는 처음 주소부터 8바이트 떨어진 위치라고 바로 알 수 있다. 그리고 배열이 링크드 리스트보다 구현하기도 쉽다. 따라서 사용하는 자료의 변동이 많은 경우에는 링크드 리스트를, 자료 변동이 거의 없는 경우에는 배열을 사용하는 것이 효율적이다.

### HashSet add 메서드
```java
public boolean add(E e) {
    return map.put(e, PRESENT)==null;
}
// map >> HashMap 클래스이다.
```

```java
 public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }

final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        Node<K,V> e; K k;
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        else {
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
    ++modCount;
    if (++size > threshold)
        resize();
    afterNodeInsertion(evict);
    return null;
}

// 여기서 중요한 점은 putVal() 메서드에서 key의 equals가 쓰인다는 점이다.
// HashSetTest에서 String은 중복이 안되고, Member는 중복이 허용했던 이유는 String 클래스는 equals와 hashCode를 재정의 했고,
// Member는 재정의를 해주지 않아 Object의 equals와 hashCode가 사용되어 중복이 허용이 가능하다.
```

```java
String.class

public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String aString = (String)anObject;
        if (coder() == aString.coder()) {
            return isLatin1() ? StringLatin1.equals(value, aString.value)
                              : StringUTF16.equals(value, aString.value);
        }
    }
    return false;
}

public int hashCode() {
    int h = hash;
    if (h == 0 && value.length > 0) {
    hash = h = isLatin1() ? StringLatin1.hashCode(value)
    : StringUTF16.hashCode(value);
    }
    return h;
}
```

> ### TreeSet 클래스
```java
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("홍길동");
    treeSet.add("강감찬");
    treeSet.add("이순신");
    
    for (String str : treeSet) {
        System.out.println(str);
    }

//        강감찬
//        이순신
//        홍길동

// 결과 값은 정렬되어 출력되었다. >> 자바는 정렬을 구현하기 위해 '이진 트리'를 사용한다.
```
```java
    MemberTreeSet memberTreeSet = new MemberTreeSet();

    Member memberPark = new Member(1003, "박서훤");
    Member memberLee = new Member(1001, "이지원");
    Member memberSon = new Member(1002, "손민국");

    memberTreeSet.addMember(memberLee);
    memberTreeSet.addMember(memberSon);
    memberTreeSet.addMember(memberPark);
    memberTreeSet.showAllMember();

//     class Chapter12.v4.Member cannot be cast to class java.lang.Comparable
//     어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지 구현하지 않았다는 뜻이다.     
```

> ### Comparable 인터페이스와 Comparator 클래스

compareTo()의 반환 값은 정수 값인데, 비교하는 두 값 중 this값이 더 크면 양수를 반환하여 오름차순으로 정렬된다.<br>
그렇지 않고 this값이 더 작으면 음수를 반환하여 내림차순으로 정렬된다.<br>
`compareTo()`는 프로그래머가 호출하는 메서드가 아닌 객체가 TreeSet에 요소를 추가할 때 호출되는 메서드이다. 그리고 어떤 매개변수가 전달될지는 기존 TreeSet에 어떤 요소가 들어 있는지에 따라 달라진다.

```java
// 내림차순으로 정렬하고 싶을 때
@Override
public int comareTo(Member member) {
    return (this.memberId - member.memberId) * (-1);
    // 내림차순으로 정렬하기 위해 반환 값을 음수로 만듦
}
```

```java
//    compare() 메서드 재정의. 전달받은 두 매개변수를 배교함
@Override
public int compare(Member2 o1, Member2 o2) {
    return o1.getMemberId() - o2.getMemberId();
}
```
Comparator인터페이스는 compare()메서드를 구현해야 하는데, 이 메서드에는 매개변수가 2개 전달된다.<br>
`compareTo()`메서드는 this와 전달된 매개변수를 비교하였다면, `compare()`메서드는 전달되는 두 매개변수를 비교한다.<br>
첫 번째 매개변수가 더 클 때 양수를 반환하여 오름차순으로 정렬된다.

Map 인터페이스
---
> ### HashMap 클래스
`HashMap`은 Map인터페이스를 구현한 클래스 중 가장 많이 사용된다. HashMap에서 자료를 관리하는 방식은 해시 방식이다.<br>
해시 방식의 자료를 저장하는 공간을 해시 테이블이라고 한다.<br>
key값이 정해지면 그에 대응하는 해시 테이블의 저장 위치가 정해지는데 이런 위치를 계산하는 함수가 `해시함수`이다.
```java
index = hash(key)   // index는 저장위치
```
자료 추가 속도나 검색 속도가 상당이 빠르다는 장점이 있다.<br>
서로 다른 key값 특성이나 같이 index가 반환되는 충돌이 발생하는 경우도 있다. 따라서 해시 테이블에 데이터를 꽉 채우지 않고 적정 수준이 되면 테이블을 확장해 충돌 발생 확률을 낮춘다.
또한 Map 인터페이스에서 사용하는 key값은 중복될 수 없으므로 equals() 메서드와 hashCode()메서드를 재정의하여 사용하는 것이 좋다.

### HashMap과 HashTable
`HashMap`과 `HashTable` 클래스는 모두 쌍으로 이루어진 자료를 관리하는데 사용된다.<br>
`HashTable`클래스는 멀티스레드를 위한 동기화를 제공한다. 멀티스레드 환경이 아니라면, HashTable보다는 HashMap을 사용하는 것을 권항한다.

> ###TreeMap 클래스
`TreeMap`은 TreeSet와 마찬가지로 이진 검색 트리로 구현되어 있다.