package dev.problem;

public class Problem14 {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("for 문");
        for(; num<=20; num+=2) System.out.printf("%2d\n", num);
        System.out.println("\nwhile 문");
        while(num<=40) {
            System.out.println(num - 20);
            num += 2;
        }
    }
}