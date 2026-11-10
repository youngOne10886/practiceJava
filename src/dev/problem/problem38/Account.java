package dev.problem.problem38;

public class Account {
    // class member
    public String name = "";
    public int balance = 0;
    // class constructor
    public Account(String name) {
        this.name = name;
    }
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
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
}
