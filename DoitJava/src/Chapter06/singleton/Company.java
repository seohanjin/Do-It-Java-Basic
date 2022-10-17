package Chapter06.singleton;

public class Company {
    private Company() { }
    private static Company instance = new Company();    //유일하게 생성한 인스턴스

    public static Company getInstance() {
        if (instance == null) {
            System.out.println("#### here i am ####");
            instance = new Company();
        }

        return instance;
    }
}
