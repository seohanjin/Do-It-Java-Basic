package Chapter15.v2;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            while((i = System.in.read()) != '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        65
//        A
    }
}
