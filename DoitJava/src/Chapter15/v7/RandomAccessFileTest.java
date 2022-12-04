package Chapter15.v7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("파일 포인트 위치: " + rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("파일 포인트 위치: " + rf.getFilePointer());

        rf.seek(0);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();


        System.out.println("파일 포인트 위치: " + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        // 파일 포인터의 위치가 맨 처음으로 옮겨지지 않아서 오류 발생
    }
}
