package dev.problem.problem38;

public class Problem38_ {
    public static void main(String[] args) {
        Account account = new Account("youngOne", 10000);
        // 입금 1000
        int depositAmount = 1000;
        Transaction transaction1 = new Transaction(Transaction.DEPOSIT_OPTION, account);
        transaction1.deposit(depositAmount);
        // 출금 2000
        int withdrawalAmount = 2000;
        Transaction transaction2 = new Transaction(Transaction.WITHDRAWAL_OPTION, account);
        transaction2.withdrawal(withdrawalAmount);
        // 입금 -1000
        int wrongDepositAmount = -1000;
        Transaction transaction3 = new Transaction(Transaction.DEPOSIT_OPTION, account);
        transaction3.deposit(wrongDepositAmount);
        // 출금 20000
        int wrongWithdrawalAmount = 20000;
        Transaction transaction4 = new Transaction(Transaction.WITHDRAWAL_OPTION, account);
        transaction4.withdrawal(wrongWithdrawalAmount);
    }
}
