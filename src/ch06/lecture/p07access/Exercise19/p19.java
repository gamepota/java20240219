package ch06.lecture.p07access.Exercise19;

public class p19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10_000);
        System.out.println("account = " + account.getBalance()); // 10000

        account.setBalance(-100);
        System.out.println("account = " + account.getBalance()); // 10000

        account.setBalance(2_000_000);
        System.out.println("account = " + account.getBalance()); // 10000

        account.setBalance(300_000);
        System.out.println("account = " + account.getBalance()); // 300000


    }
}

class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balnce) {
        if (balnce > MIN_BALANCE && balnce <= MAX_BALANCE) {
            this.balance = balnce;
        }
    }


}
