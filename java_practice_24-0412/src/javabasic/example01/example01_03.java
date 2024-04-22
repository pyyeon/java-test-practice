package javabasic.example01;

import java.util.Scanner;

public class example01_03 {
    //사용자로부터 이름과 나이를 입력받아, 그 정보를 화면에 출력하는 간단한 프로그램을 작성하세요
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요: ");
        String age = scanner.nextLine();


        // 이름은 숫자를 받으면 잘못된 입력입니다 출력
        // 나이는 글자를 받으면 잘못된 입력입니다 출력

//        String digit = "0123456789";
//        for (char c : name.toCharArray()) {
//            //문자열을 문자 배열로 바꿔서 순회
//            if (digit.indexOf(c) == -1) { //찾지못했을때 -1
//                System.out.println("이름에 숫자가 포함되어 있습니다");
//                return;
//            }
//        }
//        for (char c : age.toCharArray()) {
//            //문자열을 문자 배열로 바꿔서 순회
//            if (!(digit.indexOf(c) == -1)) { //찾지못했을때 -1
//                System.out.println("나이에 숫자만 입력해야 합니다");
//                return;
//            }
//
//        }
        if (isDigit(name)) {
            System.out.println("이름에 숫자가 포함되어 있습니다");
            return;
        }

        if (!(isDigit(age))) {
            System.out.println("나이에 숫자만 입력해야 합니다");
            return;
        }
        System.out.printf("사용자의 이름은 %s 나이는 %s 입니다", name, age);


        }

    public static boolean isDigit(String str){
        String digit = "0123456789";
        for (char c : str.toCharArray()) {
            if (digit.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
    }


