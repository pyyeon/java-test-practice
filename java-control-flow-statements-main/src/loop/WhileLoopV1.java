package loop;

public class WhileLoopV1 {
    public static void main(String[] args) {
        /**
         * (초기화);
         *
         * while(조건식) {
         *   실행문; //조건식이 참인 동안 실행
         *   증감식;
         * }
         */

        int currentNum = 0; // 카운터 변수, 현재 수행/비교해야 하는 값(조건식에 사용될)
        int sum = 0; // 결과를 담아줄 변수
        while(currentNum <= 10) { // 조건식
            // 실행문
            sum += currentNum; //sum = sum + num과 똑같은 식입니다. 복합 대입 연산자 "+="를 사용한 표현입니다.

            // 증감식
            currentNum++;
        }

        System.out.println(sum);
    }
}
