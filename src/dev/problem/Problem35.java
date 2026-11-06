package dev.problem;

import java.util.Scanner;

public class Problem35 {
    public static final int MAX_PRODUCT_COUNT = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[MAX_PRODUCT_COUNT];
        int[] productPrices = new int[MAX_PRODUCT_COUNT];
        int productCount = 0, option;
        boolean flag = true;

        while(flag) {
            System.out.println("1 : 상품 등록 | 2 : 상품 목록 | 3 : 종료");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1 -> {
                    // option = 1
                    if(productCount == MAX_PRODUCT_COUNT) {
                        System.out.println("상품 등록이 더이상 불가능합니다.");
                        System.out.printf("최대 등록 가능 개수 %d개 (현재 등록 상품 수 : %d개)\n", MAX_PRODUCT_COUNT, productCount);
                        break;
                    }

                    System.out.print("상품 명을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine();

                    productCount++;
                }
                case 2 -> {
                    // option = 2
                    for(int i=0; i<productCount; i++) System.out.println((i+1) +
                            "번째 상품 - 이름 : " + productNames[i] + " / 가격 : " + productPrices[i]);
                }
                case 3 -> {
                    // option = 3
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                }
                default -> System.out.println("올바른 옵션을 선택해주세요");
            }
        }
    }

}
