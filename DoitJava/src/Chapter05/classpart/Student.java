package Chapter05.classpart;

public class Student {
    // 클래스 속성인 멤버 변수 선언
    int studentID;          // 원시 변수         >   스택 영역
    String studentName;     // 참조 타입 변수     >   스택 영역에 (힙 영역에 있는)객체들의 주소를 저장
    int grade;              // 원시 변수         >   스택 영역
    String address;         // 참조 타입 변수     >   스택 영역에 (힙 영역에 있는)객체들의 주소를 저장

    // 클래스의 기능을 구현한 메서드
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }
}
