//package untitled3;
//
//public class ThreadTask3 implements Runnable{
//
//    @Override
//    public void run() {
//
//        while (account.getBalance() > 0) {
//
//            // 100 ~ 300원의 인출금을 랜덤으로 정합니다.
//            int money = (int)(Math.random() * 3 + 1) * 100;
//
//            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당합니다.
//            boolean denied = !account.withdraw(money);
//
//            // 인출 결과 확인
//            // 만약, withraw가 false를 리턴하였다면, 즉 인출에 실패했다면,
//            // 해당 내역에 -> DENIED를 출력합니다.
//            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
//                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
//            );
//        }
//    }
//}