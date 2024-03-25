package ch11.lecture.p3custom.Example;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (money > balance) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + "모자람");
        }

        balance -= money;
    }
}
