package dev.problem;

import java.util.Optional;

public class Problem38 {
    public static void main(String[] args) {
        int balance = 10000;

        System.out.printf("%d원을 입금하였습니다. 현재 잔액 : %d원\n",  balance);
        System.out.println();
        System.out.println();
    }
    // 입금
    public static Optional <Integer> deposit(int balance, int money) {
        if(money<=0) return Optional.empty();
        return Optional.of(balance + money);
    }
    // 출금
    public static Optional<Integer> withdrawal(int balance, int money) {
        if(money > balance) return Optional.empty();
        return Optional.of(balance - money);
    }
}
