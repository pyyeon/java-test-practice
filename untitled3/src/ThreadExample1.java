import java.util.TimerTask;

public class ThreadExample1 {
    public static void main(String[] args) {
        Runnable task1 = new ThreadTask1() ;

        Thread thread1 = new Thread(task1);

        thread1.start();
    }
}


// Runnable 인터페이스를 구현하는 클래스
