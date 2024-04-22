package conditionalStatement;

import java.util.Scanner;

public class convertScoreToGradeWithPlusAndMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("당신의 점수를 입력해주세요 :");
        int score = sc.nextInt();
        System.out.println();

        System.out.println(convertScoreToGradeWithPlusAndMinus(score));
    }

    public static String convertScoreToGradeWithPlusAndMinus(int score) {
    }
}
