
    // KioskApplication.java
package untitled2;


    public class KioskApplication {
        public static void main(String[] args) {
            Kiosk kiosk = new Kiosk();
            kiosk.printWelcomeMessage();

            // 각 메뉴 생성
            MenuItem m1 = new MenuItem("김밥", 1000, 1);
            MenuItem m2 = new MenuItem("계란 김밥", 1500, 2);
            MenuItem m3 = new MenuItem("충무 김밥", 1000, 3);
            MenuItem m4 = new MenuItem("떡볶이", 2000, 4);

            // 메뉴 선택 및 주문 수량 입력
            int price = kiosk.selectMenu(m1); // 메뉴 1 선택
            int quantity = kiosk.inputOrderQuantity(); // 수량 입력

            // 총 주문 금액 계산 및 출력
            int totalCost = kiosk.calculateTotalCost(price, quantity);
            kiosk.printOrderResult();
        }
    }

