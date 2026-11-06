package dev.problem;

public class Problem27 {
    public static void main(String[] args) {
        int[] student = new int[]{90, 80, 70, 60, 50};
        int total = 0;

        for(int score : student) total += score;
        double average = (double) total / 5;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
    }
}
