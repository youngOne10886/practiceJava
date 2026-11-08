package dev.problem;

import dev.util.NumUtils;

public class Problem36 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int sum1 = a + b + c;
        double average1 = NumUtils.avg(sum1, 3);
        System.out.println("평균값 : " + average1);

        int x = 15, y = 25, z = 35;
        int sum2 = x + y + z;
        double average2 = NumUtils.avg(sum2, 3);
        System.out.println("평균값 : " + average2);
    }
}
