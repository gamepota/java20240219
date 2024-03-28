package ch18.lecture.p5filter.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class p07 {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/lecture/p5filter/Exercise/p07.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        int rowNumber = 0;

        String rowData;

        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println((rowNumber + 1) + ": " + rowData);
            rowNumber++;

        }
        br.close();
        fr.close();

    }
}
