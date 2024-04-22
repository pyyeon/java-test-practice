package javabasic.example04;

import java.util.Arrays;

public class example04_01 {
    public static void main(String[] args) {
        //10개의 정수 값을 저장할 수 있는 배열을 생성하고,
        int[] arr = new int[10];
        //1부터 10까지의 값을 배열에 저장한 후,
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = i + 1;
        }

        // 이를 출력하세요.
        System.out.println(Arrays.toString(arr));
    }

}
