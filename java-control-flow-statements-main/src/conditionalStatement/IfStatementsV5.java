package conditionalStatement;

import java.util.Scanner;

public class IfStatementsV5 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        String dice = myInput.nextLine(); //주사위 번호 입력값을 받아옵니다.

        if (dice.equals("1")) { // 입력한 주사위 번호가 1이면 다음 블록을 실행
            System.out.println("1번"); // 콘솔에 "1번"을 출력
        }
        else if (dice.equals("2")) {
            System.out.println("2번");
        }
        else if (dice.equals("3")) {
            System.out.println("3번");
        }
        else if (dice.equals("4")) {
            System.out.println("4번");
        }
        else if (dice.equals("5")) {
            System.out.println("5번");
        }
        else if (dice.equals("6")) {
            System.out.println("6번");
        }
        else {
            System.out.println("없는 숫자! " + dice);
        }
    }
}
