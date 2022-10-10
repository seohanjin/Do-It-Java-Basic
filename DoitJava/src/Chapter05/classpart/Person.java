package Chapter05.classpart;

public class Person {

    // Person 클래스의 멤버 변수
    String name;
    float height;
    float weight;
    char gender;
    boolean married;

    public Person(){};

    public Person(String pname) {
        name = pname;
    }

    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }

}
