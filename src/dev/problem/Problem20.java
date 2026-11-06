package dev.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.printf("%d단의 구구단 :\n", num);
        for(int i=1; i<10; i++) System.out.printf("%d * %d = %d\n", num, i, num*i);
    }
}
