package Chapter13.v2.StringConCat;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);

        StringConcat a = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println("aa");
            }
        };

        StringConcat bb = (s, v) -> {
            System.out.println("bbb");
        };

    }
}
