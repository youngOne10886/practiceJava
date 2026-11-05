package dev.problem;

import java.util.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int i = 1, sum = 0;
        System.out.println("for 문");
        for(; i<=max; i++) {
            sum += i;
            System.out.println("//max = " + max);
            System.out.println(sum + "\n");
        }
        i = 1; sum = 0;
        System.out.println("\nwhile 문");
        while(i<=max) {
            sum += i++;
            System.out.println("//max = " + max);
            System.out.println(sum + "\n");
        }
    }
}
