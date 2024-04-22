package conditionalStatement;

import java.util.Scanner;

public class SwitchStatementsV2 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        String dice = myInput.nextLine(); //주사위 번호 입력

        switch (dice) {
            case "1":
            case "3": //실행문이 같으면 이렇게 작성 가능
            case "5": //실행문이 같으면 이렇게 작성 가능
                System.out.println("홀수입니다. 나온 숫자는 " + dice);
                break; //다음 case를 실행하지 않고, switch문 탈출!
            case "2":
            case "4": //실행문이 같으면 이렇게 작성 가능
            case "6": //실행문이 같으면 이렇게 작성 가능
                System.out.println("짝수입니다. 나온 숫자는 " + dice);
                break;
            default: //switch문의 괄호 안 값과 같은 값이 없으면, 여기서 실행문 실행
                System.out.println("없는 숫자! " + dice);
                break;
        }
    }
}
