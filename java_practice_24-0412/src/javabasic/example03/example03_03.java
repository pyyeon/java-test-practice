package javabasic.example03;

import java.util.Scanner;


public class example03_03 {
    public static void main(String[] args) {
       //사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
    //숫자 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int a = sc.nextInt();

        //1부터 n까지 합하기
       int sum = 0;
        for (int i = 0; i <= a; i++ ){
            sum += i;
        }

            System.out.printf("1부터 n까지 합은 %d 입니다.", sum);
        }

    }

