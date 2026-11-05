package dev.problem;

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String output = switch(num%2) {
            case 0 -> "짝수";
            case 1 -> "홀수";
            default -> "잘못된 입력";
        };
        System.out.printf("x : %d\n출력 : x = %d, %s", num, num, output);
    }
}
