package ch18.lecture.p2inputStream.Example;

import java.io.*;

public class copy {
    public static void main(String[] args) {
        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dog2.png";


        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);

            try (is; os;) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
                os.flush();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
