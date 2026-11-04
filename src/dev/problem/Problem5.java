package dev.problem;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        boolean result = (score >= 80 && score<=100);
        System.out.println(result);
    }

}
