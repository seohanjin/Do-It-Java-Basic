10/25 (화)
---
```java
int[] studentIDs = new int[10];     // int형 요소가 10개인 배열 선언
        
자료형이 int형이므로 배열 요소를 저장할 수 있는 공간의 크기는 전부 4바이트로 동일하다.
```

```java
public class Book {

    private String bookName;
    private String author;

    public Book() { }
    
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
}

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("어떻게 살 것인가", "유시민");
        library[3] = new Book("태토지", "박경리");
        library[4] = new Book("어린왕자", "생택쥐페리");

        for(int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        for (int i = 0; i < library.length; i ++) {
            System.out.println(library[i]);
        }
    }
}

>>>
태백산맥,조정래
데미안,헤르만 헤세
어떻게 살 것인가,유시민
태토지,박경리
어린왕자,생택쥐페리
Chapter07.Book.Book@7a5d012c
Chapter07.Book.Book@3fb6a447
Chapter07.Book.Book@79b4d0f
Chapter07.Book.Book@6b2fad11
Chapter07.Book.Book@79698539
```
배열의 각 요소에 Book 인스턴스를 만들어 직접 저장했다.
두번째 for문은 각 배열 요소가 가지고 있는 인스턴스 주소 값이다.

### 배열 복사하기
1. for문을 이용하여 각 요소 값을 복사하기.
2. `System.arraycopy(src, srcPos, dest, destPos, length)`

|매개변수|설명|
|:---|:---|
|src|복사할 배열 이름|
|srcPos|복사할 배열의 첫 번째 위치|
|dest|복사해서 붙여 넣을 대상 배열 이름|
|destPos|복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치|
|length|src에서 dest로 자료를 복사할 요소 개수|
---
### 얕은복사
```java
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for(int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("==== bookArray1 ===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("==== bookArray1 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
>>>
태백산맥,조정래
데미안,헤르만 헤세
어떻게 살 것인가,유시민
==== bookArray1 ===
나목,박완서
데미안,헤르만 헤세
어떻게 살 것인가,유시민
==== bookArray1 ===
나목,박완서          // bookArray1의 변경 사항이 bookArray2에 반영됨
데미안,헤르만 헤세
어떻게 살 것인가,유시민
```
bookArray1 배열 요소 값을 변경했는데 bookArray2 배열 요소 값도 변경된 것을 알 수 있다.<br>
그 이유는 객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니라 인스턴스의 주소 값이기 때문이다.<br>
따라서 객체 배열을 복사할 때 인스턴스를 따로 생성하는게 아니라 기존 인스턴스의 주소 값만 복사한다.<br>
결국 두 배열의 서로 다른 요소가 같은 인스턴스를 가리키고 있으므로 복사되는 배열의 인스턴스 값이 변경되면 두 배열 모두 영향을 받는 것이다.
---
### 깊은복사
```java
public class ObjectCopy3 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for (int i= 0; i < bookArray1.length; i++) {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        for(int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("==== bookArray1 ===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("==== bookArray2 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
```
직접 인스턴스를 만들고 그 값을 복사하는 경우이다.

