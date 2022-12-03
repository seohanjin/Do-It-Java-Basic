package Chapter15.v2;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            i = System.in.read();
            // A를 입력했을 때
            // A는 4바이트지만 System.in은 바이트 단위로 읽어 들이는 InputStream이므로 1바이트만 읽는다.
            // 읽어 들인 1바이트를 출력하면 문자에 대한 숫자 값, 즉 아스키 값을 출력한다.
            System.out.println(i);
            System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        65
//        A
    }
}
