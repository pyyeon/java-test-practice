package conditionalStatement;

import java.util.Scanner;

public class SwitchStatementsV3 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String yourPosition = userInput.nextLine(); //입력받기

        switch(yourPosition){
            case "Senior" : // Senior일 경우
                System.out.println("700만원");
                break;

            case "Junior" :  //Junior 또는 Manager일 경우
            case "Manager" : //실행문이 같으면 이렇게 작성 가능
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
                break;
        }
    }
}
