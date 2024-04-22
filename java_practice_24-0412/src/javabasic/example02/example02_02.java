package javabasic;

import java.util.Scanner;

public class example02_02 {
    public static void main(String[] args) {
        //세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
        // 세 개 정수 받음
        // 정수 크기 비교
        //가장 큰수, 작은수 출력
        Scanner scanner = new Scanner(System.in);
//        System.out.println("첫번째 수를 입력하세요: ");
//        Integer a = scanner.nextInt();
//        System.out.println("두번째 수를 입력하세요: ");
//        Integer b = scanner.nextInt();
//        System.out.println("세번째 수를 입력하세요: ");
//        Integer c = scanner.nextInt();
        //최대값 변수 선언
//       int maxNumber;
////
////       //첫번째 입력값과 두번째 입력값 비교해서 더 큰 값을 최대값을 담을 변수에 할당
////      if (a > b){
////          maxNumber = a;
////      }else {
////          maxNumber = b;
////
////      }
////      if (maxNumber < c){
////          maxNumber = c;
////      }
////        //최소값 변수 선언
////        int minNumber;
////        if (a < b){
////            minNumber = a;
////        }else {
////            minNumber = b;
////
////        }
////        if (minNumber > c){
////            minNumber = c;
////        }
        int[] numberArr = new int[3];

        for (int i = 0; i < 3; i++){

           numberArr[i] = scanner.nextInt();
        }
        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];

        for (int i = 1 ; i < numberArr.length; i++){
            maxNumber = Math.max(maxNumber, numberArr[i]);
            minNumber = Math.min(minNumber, numberArr[i]);
        }


        System.out.printf("최대값은: %d, 최소값은 : %d",maxNumber, minNumber );

        }
    }
