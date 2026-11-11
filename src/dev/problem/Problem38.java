package dev.problem;

import java.util.Optional;

public class Problem38 {
    public static final int DEPOSIT_OPTION = 1;
    public static final int WITHDRAWAL_OPTION = 2;
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000;

        System.out.println(process(DEPOSIT_OPTION, deposit(depositAmount, balance), balance));

        int withdrawalAmount = 2000;
        System.out.println(process(WITHDRAWAL_OPTION, withdrawal(withdrawalAmount, balance), balance));

        int wrongDepositAmount = -1000;
        System.out.println(process(DEPOSIT_OPTION, deposit(wrongDepositAmount, balance), balance));

        int wrongWithdrawalAmount = 50000;
        System.out.println(process(WITHDRAWAL_OPTION, withdrawal(wrongDepositAmount, balance), balance));
    }
    // 입금
    public static Optional <Integer> deposit(int amount, int balance) {
        if(amount<=0) return Optional.empty();
        return Optional.of(balance + amount);
    }
    // 출금
    public static Optional<Integer> withdrawal(int amount, int balance) {
        if(amount > balance) return Optional.empty();
        return Optional.of(balance - amount);
    }
    // 입출금 확인
    public static String process(int option, Optional<Integer> value, int balance) {
        String message = "";
        switch(option) {
            case DEPOSIT_OPTION -> {
                message += "거래 방식 : 입금\n";
                if(value.isEmpty()) {
                    message += "입금 오류 : 잘못된 금액\n";
                    break;
                }
                message += "정상적으로 거래가 완료되었습니다.\n";
            }
            case WITHDRAWAL_OPTION -> {
                message += "거래 방식 : 출금\n";
                if(value.isEmpty()) {
                    message += "출금 오류 : 잔액 부족\n";
                    break;
                }
                message += "정상적으로 거래가 완료되었습니다.\n";
            }
            default -> {
                message = "오류 : 잘못된 거래 방식입니다.";
            }
        }
        message += "잔액 : ";
        message += String.valueOf(balance);

        return message;
    }
}
