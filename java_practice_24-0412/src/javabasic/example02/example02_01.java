package javabasic.example02;

import java.util.Scanner;

public class example02_01 {
    public static void main(String[] args) {


//사용자로부터 두 개의 숫자를 입력받아, 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력
        //입력 받고
        //덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 계산
        //예외처리
        //출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요: ");
        String leftNumber = scanner.nextLine();
        System.out.println("두번째 숫자를 입력하세요: ");
        String rightNumber = scanner.nextLine();
        double leftNum = Double.parseDouble(leftNumber);
        double rightNum = Double.parseDouble(rightNumber);

        if (isDouble(leftNumber) && isDouble(rightNumber)) {
            //합,차,곱,나누기,나머지 출력
            // 나누기일때 둘중에 하나라도 0이면 invalid number
            double sum = leftNum + rightNum;
            double minus = leftNum - rightNum;
            double multiply = leftNum * rightNum;
            double divide = leftNum / rightNum;
            double remainder = leftNum % rightNum;

//            if (leftNum == 0 || rightNum == 0 ){
//                System.out.printf("합은 %f  입니다.", sum);
//                System.out.printf("차는 %f 입니다.", minus);
//                System.out.printf("곱은 %f 입니다.", multiply);
//                System.out.println("나눌 수 없는 숫자입니다.");
//            }else {
//                System.out.printf("합은 %f 입니다.\n", sum);
//                System.out.printf("차는 %f 입니다.\n", minus);
//                System.out.printf("곱은 %f 입니다.\n", multiply);
//                System.out.printf("나누면 %f 입니다.\n", divide );
//                System.out.printf("나머지는 %f 입니다.", remainder);
//            }
            System.out.printf("합은 %f 입니다.\n", sum);
            System.out.printf("차는 %f 입니다.\n", minus);
            System.out.printf("곱은 %f 입니다.\n", multiply);

            if (leftNum == 0 || rightNum == 0) {
                System.out.println("나눌 수 없습니다.");
            } else {

            }
            System.out.printf("나누면 %f 입니다.\n", divide);
            System.out.printf("나머지는 %f 입니다.", remainder);

        }
    }

    public static boolean isDouble(String str) {
        String digit = "-0123456789.";
        int dotCount = 0;
        for (char c : str.toCharArray()) {
            if (digit.indexOf(c) == -1) {
                return false;
            }
            if (c == '.') {
                dotCount++;
            }
            return dotCount <= 1;// "."이 1개 이하면 true, 아니면 false
        }

        return true;
    }

}