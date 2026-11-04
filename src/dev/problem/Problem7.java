package dev.problem;

import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        String transport = switch(true) {
            case boolean flag when distance <= 1 -> "도보";
            case boolean flag when distance <= 10 -> "자전거";
            case boolean flag when distance <= 100 -> "자동차";
            default -> "비행기";
        };
        System.out.println(transport + "를 이용하세요");
    }
}
