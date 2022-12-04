package Chapter15.v4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader fr = new FileReader("reader.txt")){
            int i;
            while((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
