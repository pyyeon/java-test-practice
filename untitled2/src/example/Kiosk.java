
// Kiosk.java
package example;

import java.util.Scanner;


public class Kiosk {
        private static Scanner scanner = new Scanner(System.in);
        private static int totalCost = 0;

        // 주문 안내 메시지를 출력하는 메서드
        public void printWelcomeMessage() {
            System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        }

        // 메뉴를 선택하고 가격을 반환하는 메서드
        public int selectMenu(MenuItem menuItem) {
            System.out.println("-".repeat(30));
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            System.out.printf("%d) %s(%d원)\n", menuItem.getId(), menuItem.getName(), menuItem.getPrice());
            return menuItem.getPrice();
        }

        // 주문 수량을 입력받는 메서드
        public int inputOrderQuantity() {
            int quantity;
            while (true) {
                System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
                System.out.println("(※ 최대 주문 가능 수량 : 99)");
                quantity = scanner.nextInt();
                if (quantity > 0 && quantity < 100) {
                    break;
                } else {
                    System.out.println("[경고]100개는 입력하실 수 없습니다.\n");
                    System.out.println("[경고]수량 선택 화면으로 돌아갑니다.\n");
                }
                System.out.println();
            }
            return quantity;
        }

        // 주문 총 금액을 계산하는 메서드
        public int calculateTotalCost(int price, int quantity) {
            totalCost = price * quantity;
            return totalCost;
        }

        // 주문 결과를 출력하는 메서드
        public void printOrderResult() {
            System.out.println("-".repeat(30));
            System.out.printf("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.\n", totalCost);
            System.out.println("[안내]이용해 주셔서 감사합니다.");
        }
    }
