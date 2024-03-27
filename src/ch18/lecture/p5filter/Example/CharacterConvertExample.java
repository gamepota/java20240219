package ch18.lecture.p5filter.Example;

import java.io.*;

public class CharacterConvertExample {
    public static void main(String[] args) throws Exception {
        write("문자 변화 스트림 사용");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }
}
