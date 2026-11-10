package dev.problem.problem38;

public class Transaction_a {
    // class constant
    public static final int DEPOSIT_OPTION = 1;
    public static final int WITHDRAWAL_OPTION = 2;
    // class member
    private int option;
    private boolean success = false;
    private String message = "";
    public Account_a account;
    // class constructor
    public Transaction_a(int option, Account_a account) {
        this.option = option;
        this.account = account;
    }
    // class method
    public void process(int amount) {
        switch(this.option) {
            case DEPOSIT_OPTION -> {
                this.message += "거래 방식 : 입금\n";
                this.message += "거래 금액 : ";
                this.message += String.valueOf(amount);
                this.message += "원(입금)\n";
                if(amount<=0) {
                    this.message += "오류 : 입금 - 잘못된 금액\n";
                    break;
                }
                this.account.deposit(amount);
                this.success = true;
            }
            case WITHDRAWAL_OPTION -> {
                this.message += "거래 방식 : 출금\n";
                this.message += "거래 금액 : ";
                this.message += String.valueOf(amount);
                this.message += "원(출금)\n";
                if(amount > this.account.getBalance()) {
                    this.message += "오류 : 출금 - 잔액 부족\n";
                    break;
                }
                this.account.withdrawal(amount);
                this.success = true;
            }
            default -> {
                this.message += "오류 : 잘못된 거래 방식\n";
            }
        }
        if(this.success) this.message += "정상적으로 거래가 완료되었습니다. ";
        else this.message += "오류로 인해 거래가 취소되었습니다. ";
        this.message += "잔액 : " + this.account.getBalance() + "원\n";
        this.account.addLog(this.message);
    }
    @Override
    public String toString() {
        return this.message;
    }
}
