package javabasic;
import java.util.Scanner;
public class example03_01 {
    public static void main(String[] args) {
        //사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
    Scanner sc = new Scanner(System.in);
        System.out.println(" 숫자를 입력하세요: ");
        int a = sc.nextInt();
      //0인지 아닌지
        if ( a == 0){
            System.out.println("0입니다");
        }else {
            // 음수인지 양수인지
            if (a < 0){
                System.out.println("음수입니다.");
            }else {
                System.out.println("양수입니다.");
            }

        }



    }
}
