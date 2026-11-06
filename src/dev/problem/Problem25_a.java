package dev.problem;

import java.util.Scanner;

public class Problem25_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, rep = 0, num;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while((num = scanner.nextInt())!=-1) {
            sum += num;
            rep ++;
        }

        System.out.printf("입력한 숫자들의 합계 : %d\n", sum);
        double average = sum / rep;
        System.out.printf("입력한 숫자들의 평균 : %.1f", average);
    }
}
