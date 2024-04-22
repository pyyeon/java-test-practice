package loop;

public class ForLoopV4 {
    public static void main(String[] args) {
        /**
         for(초기화; 조건식, 증감식) {

         }

         for(int i = 0; i < 100; i++) {
            // do something..
         }

         Q1. 그렇다면, 0~100이 아닌, 지정된 숫자까지 더하는 값을 구하는 방법은?

         Q2. 그렇다면, 0이 아닌, 특정한 숫자부터 더하는 방법은?

         Q3. 1씩 증가하는것이 아닌, 필요한 숫자만큼 증가하는 값을 더하는 방법은?

         Q4, forloop은 증갑식이 증가하는 경우에만 사용이 가능한지?
         **/

        // Q1. 그렇다면, 0~100이 아닌, 지정된 숫자까지 더하는 값을 구하는 방법은?
        int dst = 150;
        int sum = 0;
        for(int i = 0; i <= dst; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        // Q2. 그렇다면, 0이 아닌, 특정한 숫자부터 더하는 방법은?
        dst = 200;
        int src = 10;
        sum = 0;

        for(int i = src; i <= dst; i++) {
            sum += i;
        }

        System.out.println(sum);


        // Q3. 1씩 증가하는것이 아닌, 필요한 숫자만큼 증가하는 값을 더하는 방법은?

        dst = 20;
        src = 10;
        sum = 0;

        for(int i = src; i <= dst; i += 5) {
            sum += i;
        }

        System.out.println(sum);

        // Q4, forloop은 증감식이 증가하는 경우에만 사용이 가능한지?
        sum = 0;
        for(int i = 10; i > 0; i--) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
