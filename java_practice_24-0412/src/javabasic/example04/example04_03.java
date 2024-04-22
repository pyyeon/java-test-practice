package javabasic.example04;

import java.util.Scanner;

public class example04_03 {
    //주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr ;

        System.out.println("배열크기를 입력하세요");
        int size = sc.nextInt(); // 입력받은 정수개수
        arr = new int[size];//배열 선언
        System.out.println("배열 요소를 입력하세요.");
            for (int i = 0; i < arr.length; i++){  //배열 크기만큼 입력 받기
                arr[i] = sc.nextInt();
            }
            //최대값
            int maxNumber = arr[0];//선언
            int minNumber = arr[0];
            //0부터 배열 길이 순회하면서 비교
            for (int i = 0; i < arr.length; i++){
                maxNumber = Math.max(maxNumber, arr[i]); // 최대값
                minNumber = Math.min(minNumber, arr[i]);    //최소값

            }
               System.out.printf("최대값은 %d , 최소값은 %d 입니다.",maxNumber, minNumber );


        }



//    pickMaxMinArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
//        pickMaxMinArray(new int[]{});
//        pickMaxMinArray(new int[]{1, 2, 3});

    }
//    public static void pickMaxMinArray(int[] array) {
//
//    }
//}
