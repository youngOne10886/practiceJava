package dev.problem;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int scoreInt = Integer.parseInt(args[0]);
        String scoreString = switch (scoreInt / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
        System.out.println("학점은 " + scoreString + "입니다.");
    }
}
