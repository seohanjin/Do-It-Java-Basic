package Chapter06;

public class ThisExample {

    public static void main(String[] args) {
        BirthDay bDAy = new BirthDay();
        bDAy.setYear(2000);
        System.out.println(bDAy);
        bDAy.printThis();
    }
}

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