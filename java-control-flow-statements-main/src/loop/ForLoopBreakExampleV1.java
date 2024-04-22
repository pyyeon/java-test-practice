package loop;

public class ForLoopBreakExampleV1 {
    public static void main(String[] args) {

        // 아래 코드는 이중 반복문에서 break를 활용하는 예제입니다.
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                // i = 5, j = 5일경우 반복문을 종료합니다.
                if(i == 5 && j == 5) {
                    break;
                }
                System.out.printf("현재 변수 i의 값은: %d, 현재 변수 j의 값은: %d%n", i, j);
            }
        }
    }
}
