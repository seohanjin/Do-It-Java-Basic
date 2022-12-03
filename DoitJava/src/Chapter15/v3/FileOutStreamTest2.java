package Chapter15.v3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("output2.txt", true);
        try(fos) {
            byte[] bs = new byte[26];
            byte data = 65;
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
