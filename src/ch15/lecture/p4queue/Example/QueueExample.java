package ch15.lecture.p4queue.Example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendmail", " 홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용둰"));
        messageQueue.offer(new Message("sendkakaotalk", "박남길"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendmail":
                    System.out.println(message.to + "님에게 메일");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 sms");
                    break;
                case "sendkakaotalk":
                    System.out.println(message.to + "님에게 어쩌구");
                    break;
            }
        }
    }
}
