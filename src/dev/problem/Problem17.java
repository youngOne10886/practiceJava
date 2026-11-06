package dev.problem;

public class Problem17 {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        System.out.printf("//rows = %d\n", rows);
        for(int i=1; i<=rows; i++) {
            for(int j=0; j<i-1; j++) System.out.print("*");
            System.out.println("*");
        }
    }
}
