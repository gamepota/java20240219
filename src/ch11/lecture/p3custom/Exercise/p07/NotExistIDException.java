package ch11.lecture.p3custom.Exercise.p07;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
        super();
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
