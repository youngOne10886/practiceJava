package dev.problem;

import dev.util.ArrayUtils;
import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 정수의 개수를 입력하세요 : ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("%d개의 정수를 입력하세요 :\n", arraySize);
        int[] num = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            num[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int min = ArrayUtils.min(num);
        System.out.printf("가장 작은 정수 : %d\n", min);

        int max = ArrayUtils.max(num);
        System.out.printf("가장 큰 정수 : %d\n", max);
    }
}
