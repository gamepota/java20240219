package ch06.lecture.p07access.Exercise20;

import java.util.Scanner;

public class Account {
    private String number; // 계좌번호, 계좌주, 현재 잔액 필요
    private String name;
    private int balance;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
