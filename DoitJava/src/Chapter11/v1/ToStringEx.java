package Chapter11.v1;

class Book{
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + " , " + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        System.out.println(book1);              // 자동으로 toString() 메서드가 호출된다.(Object클래스의 toString() 메서드)
        System.out.println(book1.toString());
    }
}
