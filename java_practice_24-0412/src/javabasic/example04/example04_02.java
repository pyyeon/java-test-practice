package javabasic.example04;

import java.util.Scanner;

public class example04_02 {
    public static void main(String[] args) {
        //사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음,
        Scanner sc = new Scanner(System.in);
        //배열 길이 설정
        int[] scores = new int[5];
        //5명 점수 입력받음
        System.out.println("5명의 학생의 점수를 입력하세요");
        int avg = 0;
        int sum = 0;
        for ( int i = 0; i < scores.length; i++ ) {
            scores[i] = sc.nextInt(); //배열에 점수입력받음
            sum += scores[i]; // 점수 합
        }
        // 평균 점수를 계산하여 출력하세요.

//        for (int score : scores) {
//            //총합 += 배열[i];
//            sum += score;
//
//        }
        //평균내기
        avg =  sum / (scores.length);

        //출력하기
        System.out.printf("평균 점수는 %d 입니다.", avg);
    }
}
