package Chapter11.v2;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);           // str3과 str4 상수 풀에 저장되어 있으므로 str3, str4가 가리키는 주소 값이 같음
        System.out.println(str3.equals(str4));
    }
}
