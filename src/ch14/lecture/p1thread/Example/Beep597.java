package ch14.lecture.p1thread.Example;

import java.awt.*;

public class Beep597 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("삡");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }
}
