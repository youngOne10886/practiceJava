package dev.problem;

import dev.problem.problem38.Account_a;
import dev.problem.problem38.Transaction_a;
import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Account_a account = new Account_a("youngOne");

        while(flag) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            int amount = 0;
            switch(option) {
                // 입금
                case Transaction_a.DEPOSIT_OPTION ->{
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                }
                case Transaction_a.WITHDRAWAL_OPTION -> {
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.println("잔액 : " + account.getBalance() + "원");
                    continue;
                }
                case 4 -> {
                    System.out.println("프로그램 종료");
                    flag = false;
                    continue;
                }
                default -> {
                    System.out.println("잘못된 입력");
                    continue;
                }
            }
            Transaction_a tr = new Transaction_a(option, account);
            tr.process(amount);
            System.out.println(tr.toString());
        }
    }
}
