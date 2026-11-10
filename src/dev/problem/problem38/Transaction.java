package dev.problem.problem38;

public class Transaction {
    // class constant
    public static final int DEPOSIT_OPTION = 1;
    public static final int WITHDRAWAL_OPTION = 2;
    // class member
    public int option;
    public boolean success = false;
    public String message = "";
    public Account account;
    // class constructor
    public Transaction(int option, Account account) {
        this.option = option;
        this.account = account;
    }
    // class method
    public void deposit(int amount) {
        this.message += "거래 방식 : 입금\n";
        this.message += "거래 금액 : ";
        this.message += String.valueOf(amount);
        this.message += "원(입금)\n";
        if(amount<=0) {
            this.message += "입금 오류 : 잘못된 금액\n";
            this.printMessage();
            return;
        }
        this.account.balance += amount;
        this.success = true;
        this.printMessage();
    }
    public void withdrawal(int amount) {
        this.message += "거래 방식 : 출금\n";
        this.message += "거래 금액 : ";
        this.message += String.valueOf(amount);
        this.message += "원(출금)\n";
        if(amount > this.account.balance) {
            this.message += "출금 오류 : 잔액 부족\n";
            this.printMessage();
            return;
        }
        this.account.balance -= amount;
        this.success = true;
        this.printMessage();
    }
    public void printMessage(){
        System.out.print(this.message);
        if(this.success) System.out.println("정상적으로 거래가 완료되었습니다.");
        else System.out.println("오류로 인해 거래가 취소되었습니다.");
        System.out.println("잔액 : " + this.account.getBalance() + "원\n");
    }
}
