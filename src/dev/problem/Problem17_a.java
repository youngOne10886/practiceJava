package dev.problem;

public class Problem17_a {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        System.out.printf("//rows = %d\n", rows);
        for(int i=1; i<=rows; i++) {
            // for(int j=0; j<rows-1; j++) System.out.print(" ");
            printBlank(rows, i);
            for(int j=0; j<2*i-1; j++) System.out.print("*");
            printBlank(rows, i);
            System.out.println("");
        }
    }
    // print blank
    public static void printBlank(int rows, int currentRows) {
        for(int i=0; i<rows-currentRows; i++) System.out.print(" ");
        return;
    }
}
