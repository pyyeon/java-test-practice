package loop;

public class ForLoopContinueExampleV1 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { //나머지가 0일 경우는
                continue; //다음 반복으로 넘어간다.
            }
            System.out.println(i); //홀수만 출력
        }
    }
}
