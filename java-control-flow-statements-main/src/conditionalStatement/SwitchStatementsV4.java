package conditionalStatement;

import java.util.Scanner;

public class SwitchStatementsV4 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String[] positionList = {"Manager", "Senior", "Junior"};
        String yourPosition = userInput.nextLine(); //입력 받기

//        switch (yourPosition) {
//            case "Senior" -> System.out.println("700만원");
//            case "Junior", "Manager" -> System.out.println("500만원");
//        }
    }
}
