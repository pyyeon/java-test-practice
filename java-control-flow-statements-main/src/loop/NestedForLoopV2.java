package loop;

public class NestedForLoopV2 {
    public static void main(String[] args) {

        // 반복문은 여러번 중첩될 수 있습니다.
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    System.out.printf("현재 변수 i의 값은: %d, 현재 변수 j의 값은: %d, 현재 변수 k의 값은: %d%n", i, j, k);
                }
            }
        }
    }
}
