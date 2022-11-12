package Chapter11.v1;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + " , " + studentName;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if (studentLee == studentLee2) {
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) {
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
        }

        if (studentLee == studentSang) {
            System.out.println("studentLee와 studentSang 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang 주소는 다릅니다.");
        }

        if (studentLee.equals(studentSang)) {
            System.out.println("studentLee와 studentSang 동일합니다.");
        } else {
            System.out.println("studentLee와 studentSang 동일하지 않습니다.");
        }

        //studentLee와 studentLee2의 주소는 같습니다.
        //studentLee와 studentLee2는 동일합니다.
        //studentLee와 studentSang 주소는 다릅니다.
        //studentLee와 studentSang 동일하지 않습니다.
    }
}
