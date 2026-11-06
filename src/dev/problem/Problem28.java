package dev.problem;

import java.util.Scanner;

public class Problem28 {
    public static final int ARRAY_SIZE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[ARRAY_SIZE];

        System.out.printf("%d개의 정수를 입력하세요 : \n", ARRAY_SIZE);
        for(int i=0; i<ARRAY_SIZE; i++) {
            num[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("출력");
        for(int i=0; i<ARRAY_SIZE-1; i++) System.out.printf("%d, ", num[i]);
        System.out.println(num[ARRAY_SIZE-1]);
    }
}
