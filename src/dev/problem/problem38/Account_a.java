package dev.problem.problem38;

public class Account_a {
    // class member
    private String name = "";
    private int balance = 0;
    private String log = "";
    // class constructor
    public Account_a(String name) {
        this.name = name;
        this.log += this.name + "님의 계좌\n";
    }
    public Account_a(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.log += this.name + "님의 계좌\n";
    }
    // class method
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }
    public void deposit(int amount) { this.balance += amount; }
    public void withdrawal(int amount) { this.balance -= amount; }
    public void addLog(String log) { this.log += log; }
    public String getLog() { return this.log; }
}