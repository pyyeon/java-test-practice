package loop;

public class WhileLoopV2 {
    public static void main(String[] args) {
        // isValid 변수를 true로 초기화하여 반복문의 실행 조건을 설정합니다.
        boolean isValid = true;

        // currentNum 변수를 0으로 초기화합니다. 이 변수는 반복문 내에서 증가하며 sum에 더해질 값입니다.
        int currentNum = 0;

        // sum 변수를 0으로 초기화합니다. 이 변수는 currentNum의 누적 합계를 저장하는 데 사용됩니다.
        int sum = 0;

        // while 반복문을 사용하여 isValid가 true인 동안 반복 실행합니다.
        while(isValid) {
            // currentNum 값을 sum에 더합니다.
            sum += currentNum;

            // currentNum 값을 1 증가시킵니다.
            currentNum++;

            // 만약 currentNum의 값이 22가 되면, isValid를 false로 설정하여 반복문을 종료합니다.
            if(currentNum == 22) {
                isValid = false;
            }
        }

        // 반복문이 종료된 후, sum 변수에 저장된 총합을 출력합니다.
        System.out.println(sum); // 0부터 21까지의 합계인 231을 출력합니다.
    }
}
