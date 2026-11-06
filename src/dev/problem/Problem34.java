package dev.problem;

import java.util.Scanner;

public class Problem34 {
    //public static final int NUMBER_OF_STUDENT = 4;
    public static final int NUMBER_OF_SUBJECT = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int numberOfStudent = scanner.nextInt();
        scanner.nextLine();

        int[][] score = new int[numberOfStudent][NUMBER_OF_SUBJECT];
        int[] totalScore = new int[numberOfStudent];

        for(int i=0; i<numberOfStudent; i++) {
            int sum = 0;
            System.out.printf("%d번 학생의 성적을 입력하세요 : \n", (i+1));

            System.out.print("국어 점수 : ");
            sum += score[i][0] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("영어 점수 : ");
            sum += score[i][1] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("수학 점수 : ");
            sum += score[i][2] = scanner.nextInt();
            scanner.nextLine();

            totalScore[i] = sum;
        }

        for(int i=0; i<numberOfStudent; i++) {
            double avg = (double) totalScore[i] / NUMBER_OF_SUBJECT;
            //System.out.printf("%d번 학생의 총점 : %d, 평균 : %f\n", (i+1), totalScore[i], avg);
            System.out.println((i+1) + "번 학생의 총점 : " + totalScore[i] + ", 평균 : " + avg);
        }
    }

}
