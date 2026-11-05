package dev.problem;

import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int bigger = (a > b) ? a : b;
        System.out.printf("더 큰 숫자는 %d입니다.", bigger);
    }
}