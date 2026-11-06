package dev.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("음식 이름을 입력하세요 : ");
        String foodName = scan.nextLine();

        System.out.print("음식의 가격을 입력하세요 : ");
        int foodPrice = scan.nextInt();

        System.out.print("음식의 수량을 입력하세요 : ");
        int foodQuantity = scan.nextInt();
        System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d원입니다.", foodName, foodQuantity, foodPrice);
    }
}
