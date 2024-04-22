package javabasic.example03;

public class example03_02 {
    public static void main(String[] args) {
        //1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.

        for (int i = 2; i <= 100; i++){//1부터 100까지
            if (i %2 == 0){
                System.out.println(i);//출력
            }
        }
    }
}
