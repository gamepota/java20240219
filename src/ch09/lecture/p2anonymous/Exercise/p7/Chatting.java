package ch09.lecture.p2anonymous.Exercise.p7;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage(String message) {

        }
    }

    void startChat(String chatId) {
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override
            public void start() {
                while (true) {
                    String inputData = "dkssudgktpdy";
                    String message = "[" + nickName + "]" + inputData; //
                    sendMessage(message); // nickname은 중첩 클래스의 로컬 변수라 바꿀 수 없다.
                }
            }
        };
        chat.start();
    }
}
