package dev.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scan.nextLine();
        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.", name, age);
    }
}
