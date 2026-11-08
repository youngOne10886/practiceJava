package dev.util;

public class ArrayUtils {
    // 배열의 최대값을 구하는 메소드
    public static int max(int[] intArray) {
        int max = intArray[0];
        for(int element : intArray) max = (max < element) ? element : max;
        return max;
    }
    // 배열의 최소값을 구하는 메소드
    public static int min(int[] intArray) {
        int min = intArray[0];
        for(int element : intArray) min = (min > element) ? element : min;
        return min;
    }

}
