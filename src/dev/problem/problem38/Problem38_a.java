package dev.problem.problem38;

public class Problem38_a {
    public static void main(String[] args) {
        Account_a account = new Account_a("youngOne", 10000);
        // 입금 1000
        int depositAmount = 1000;
        Transaction_a t1 = new Transaction_a(Transaction.DEPOSIT_OPTION, account);
        t1.process(depositAmount);
        System.out.println(t1.toString());
        // 출금 2000
        int withdrawalAmount = 2000;
        Transaction_a t2 = new Transaction_a(Transaction.WITHDRAWAL_OPTION, account);
        t2.process(withdrawalAmount);
        System.out.println(t2.toString());
        // 입금 -1000
        int wrongDepositAmount = -1000;
        Transaction_a t3 = new Transaction_a(Transaction.DEPOSIT_OPTION, account);
        t3.process(wrongDepositAmount);
        System.out.println(t3.toString());
        // 출금 20000
        int wrongWithdrawalAmount = 20000;
        Transaction_a t4 = new Transaction_a(Transaction.WITHDRAWAL_OPTION, account);
        t4.process(wrongWithdrawalAmount);
        System.out.println(t4.toString());
        // 로그 출력
        System.out.println(account.getLog());
    }
}
