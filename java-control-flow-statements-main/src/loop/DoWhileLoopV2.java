package loop;

import java.util.Scanner;

public class DoWhileLoopV2 {
    public static void main(String[] args) {
        /**
         * 기존에 학습한, 콘솔 입 출력을 통하여
         * 임의의 랜덤한 숫자를 정확하게 맞출 경우까지 반복하는 코드입니다.
         */

        int input = 0, randomNum = 0; // 사용자 입력과 임의의 숫자를 저장할 변수 선언 및 초기화

        // Math.random()을 사용하여 1과 10 사이의 임의의 정수를 생성합니다.
        // Math.random()은 0.0과 1.0 사이의 더블 값을 반환하므로, 이를 10배 하고 1을 더함으로써 1~10 사이의 수를 얻습니다.
        randomNum = (int)(Math.random() * 10) + 1;

        // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 정답을 맞출 때까지 반복
        do{
            System.out.println("1과 10 사이의 정수를 입력하세요");
            // 사용자로부터 정수 입력 받기
            input = scanner.nextInt();

            // 사용자의 입력이 임의의 숫자보다 클 경우
            if(input > randomNum) {
                System.out.println("더 작은 정수를 입력하세요");
            }
            // 사용자의 입력이 임의의 숫자보다 작을 경우
            else if (input < randomNum) {
                System.out.println("더 큰 정수를 입력하세요");
            }
        } while(input != randomNum); // 사용자의 입력이 임의의 숫자와 다를 동안 반복
        System.out.println(randomNum +" 정답입니다!"); // 정답인 경우 메시지 출력
    }
}
