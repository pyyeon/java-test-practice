package loop;

public class DoWhileLoopV1 {
    public static void main(String[] args) {
        /**
         * do {
         *   1. 실행문 //처음 한 번은 무조건 실행
         * } while((2. 조건식);
         */

        /**
         * 아래 코드는 whileLoopV1에서 사용한 코드입니다.
         *         int currentNum = 0; // 카운터 변수, 현재 수행/비교해야 하는 값(조건식에 사용될)
         *         int sum = 0; // 결과를 담아줄 변수
         *         while(currentNum <= 10) { // 조건식
         *             // 실행문
         *             sum += currentNum; //sum = sum + num과 똑같은 식입니다. 복합 대입 연산자 "+="를 사용한 표현입니다.
         *
         *             // 증감식
         *             currentNum++;
         *         }
         *
         *         System.out.println(sum);
         *     }
         *
         *     위 결과와 같은 결과를 내는 do-while 코드는 아래에서 확인 가능합니다.
         */

        int currentNum = 0; // 카운터 변수, 현재 수행/비교해야 하는 값(조건식에 사용될)
        int sum = 0; // 결과를 담아줄 변수

        // do-while 반복문 시작
        do {
            // 실행문
            sum += currentNum; // sum = sum + currentNum과 동일한 식입니다. 복합 대입 연산자 "+="를 사용한 표현입니다.

            // 증감식
            currentNum++;
        } while(currentNum <= 10); // 조건식이 여기에 위치합니다.

        System.out.println(sum); // sum의 최종 값인 55를 출력합니다.
    }
}
