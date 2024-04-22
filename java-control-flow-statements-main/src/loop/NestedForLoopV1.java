package loop;

public class NestedForLoopV1 {
    public static void main(String[] args) {

        // 반복문 내에서 또 다른 반복문을 사용할 수 있습니다.
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("현재 변수 i의 값은: %d, 현재 변수 j의 값은: %d%n", i, j);
            }
        }
    }
}
