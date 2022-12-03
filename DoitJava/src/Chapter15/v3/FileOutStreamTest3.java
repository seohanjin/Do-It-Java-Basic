package Chapter15.v3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest3 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("output3.txt");
        try(fos) {
            byte[] bs = new byte[26];
            byte data = 65;
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
