package dev.problem;

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("입력받을 정수의 개수를 입력하세요 : ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("%d개의 정수를 입력하세요 :\n", arraySize);
        int[] num = new int[arraySize];
        for(int i=0; i<arraySize; i++) {
            sum += num[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.printf("입력한 정수의 합계 : %d\n", sum);

        double avg = (double) sum / arraySize;
        System.out.printf("입력한 정수의 평균 : %.1f\n", avg);
    }
}
