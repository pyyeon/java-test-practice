package com.jungmin;
//두 개의 수와 기호를 입력받아 알맞게 계산한 값을 리턴해야 합니다.
public class H_MiniCalculator {
    public int miniCalculator(int num1, int num2, char operator) {
        switch (operator){
            case '+':
               return (num1 + num2);

            case '-':
                return (num1 - num2);

            case '*':
                return  (num1 * num2);

            case '/':
                return  (num1 / num2);

            case '%':
                return  (num1 % num2);

            default: //switch문의 괄호 안 값과 같은 값이 없으면, 여기서 실행문 실행
                return 0;

        }
    }
}
