package dev.problem;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, rep = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while(true) {
            int num = scanner.nextInt();
            if(num==-1) {
                System.out.printf("입력한 숫자들의 합계 : %d\n", sum);
                double average = sum / rep;
                System.out.printf("입력한 숫자들의 평균 : %.1f", average);
                break;
            }

            sum += num;
            rep ++;
        }
    }
}
