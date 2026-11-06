package dev.problem;

import java.util.Scanner;

public class Problem30 {
    public static final int ARRAY_SIZE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[ARRAY_SIZE];
        int sum = 0;

        System.out.printf("%d개의 정수를 입력하세요 : \n", ARRAY_SIZE);
        for(int i=0; i<ARRAY_SIZE; i++) {
            sum += num[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.printf("입력한 정수의 합계 : %d\n", sum);

        double avg = (double) sum / ARRAY_SIZE;
        System.out.printf("입력한 정수의 평균 : %.1f\n", avg);
    }
}
