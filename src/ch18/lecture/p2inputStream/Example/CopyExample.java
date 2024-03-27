package ch18.lecture.p2inputStream.Example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "temp/go3.jpg";
        String targetFileName = "temp/go3_copy.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);
        byte[] data = new byte[1024];
        while (true) {
            int num = is.read(data);
            if (num == -1) break;
            os.write(data, 0, num);
        }
        os.flush();
        os.close();
        is.close();

        System.out.println("복사 완료");
    }
}
