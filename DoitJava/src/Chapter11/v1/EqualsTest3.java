package Chapter11.v1;

class Student3 {
    int studentId;
    String studentName;

    public Student3(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + " , " + studentName;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}

public class EqualsTest3 {
    public static void main(String[] args) {
        Student3 studentLee = new Student3(100, "이상원");
        Student3 studentLee2 = studentLee;
        Student3 studentSang = new Student3(100, "이상원");

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

        System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
        System.out.println("studentSang의 hashCode : " + studentSang.hashCode());

        System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
        System.out.println("studentSang 실제 주소값 : " + System.identityHashCode(studentSang));

    }
}
