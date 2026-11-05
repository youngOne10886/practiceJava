package dev.problem;

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("for 문");
        for(; count<=10; count++) System.out.printf("%2d\n", count);
        System.out.println("\nwhile 문");
        while(count<=20) {
            System.out.println(count-10);
            count++;
        }
    }
}
