package dev.problem;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int DOLLAR_TO_WON = 1300;
        int dollar = Integer.parseInt(args[0]);
        int won = 0;
        if(dollar>0) {
            won = dollar * DOLLAR_TO_WON;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
        else if(dollar==0) System.out.println("환전할 금액이 없습니다.");
        else System.out.println("잘못된 금액입니다.");
    }
}
