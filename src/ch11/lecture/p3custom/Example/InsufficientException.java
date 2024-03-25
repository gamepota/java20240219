package ch11.lecture.p3custom.Example;

public class InsufficientException extends Exception {
    public InsufficientException() {
        super();
    }

    public InsufficientException(String message) {
        super(message);
    }
}
