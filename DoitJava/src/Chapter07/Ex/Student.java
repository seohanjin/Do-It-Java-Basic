package Chapter07.Ex;


import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
        System.out.println("생성자:::" +  subjectList);
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
        System.out.println("plusSubject:::" + subjectList);
    }

    public void plusSubject(Subject subject) {
        subjectList.add(subject);
        System.out.println("plusSubject:::" + subjectList);
        for (Subject list : subjectList) {
            System.out.println(list.getName() + " " + list.getScorePoint());
        }
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목성적은 " + s.getScorePoint() + "입니다.");
       }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
