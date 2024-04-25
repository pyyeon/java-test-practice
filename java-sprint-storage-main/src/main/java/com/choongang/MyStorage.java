package com.choongang;  // 패키지 선언, 해당 클래스를 com.choongang 패키지에 속하게 합니다.

import java.util.Scanner;  // Scanner 클래스를 사용하기 위해 java.util 패키지에서 가져옵니다.

public class MyStorage {
    // 'EMPTY'는 빈 제품 위치를 나타내는 상수로, '등록 가능' 문자열을 저장하고 있습니다.
    public final static String EMPTY = "등록 가능";
    // product는 현재 등록된 제품을 저장하는 배열입니다.
    static String[] products = new String[]{EMPTY,EMPTY,EMPTY,EMPTY,EMPTY};
    // counts는 제품의 수량을 저장하는 배열입니다.
    static int[] counts = new int[]{0, 0, 0, 0, 0};

    /**
     * 메뉴 옵션을 화면에 표시하는 메서드입니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     */
    public static void showMenu() {
        System.out.println("1. 물건 정보(제품명) 등록하기");
        System.out.println("2. 물건 정보(제품명) 등록 취소하기");
        System.out.println("3. 물건 넣기 (제품 입고)");
        System.out.println("4. 물건 빼기 (제품 출고)");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("-".repeat(30)); // '-' 문자를 30번 반복하여 줄을 그어 메뉴 구분을 명확하게 합니다.

    }
    /**
     * 사용자로부터 선택된 메뉴 번호를 입력 받아 반환하는 메서드입니다.
     * @param s Scanner 객체, 사용자로부터 입력을 받기 위해 사용됩니다.
     * @return int 메뉴 번호를 정수 형태로 반환합니다.
     */

    public static int selectMenu(Scanner s){
        System.out.print("[System] 원하는 기능의 번호를 입력하세요 : ");
        int select = Integer.parseInt(s.nextLine());  // 사용자로부터 정수 입력을 받아 변수 select에 저장합니다.
        return select;  // 입력 받은 정수를 반환합니다.
    }

    /**
     * 제품을 등록하는 메서드입니다.
     * @param s Scanner 객체, 사용자로부터 제품명 입력을 받기 위해 사용됩니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     * 제품의 이름을 입력받아, products 배열에 할당합니다.
     */
    static void prod_input(Scanner s) {
        // 제품 등록 로직을 구현합니다. 제품명을 입력받아 빈 배열 위치에 저장합니다.
        // TODO:제품이 등록되면 새롭게 추가된 상품의 갯수는 항상 0개여야 합니다.
        //contains Emty라면 등록, 아니라면 초과라고 출력
        //Emty가 있으면 품목을 count++해서 품목명을 products[count]에 입력함
        boolean isRegistered = false;

        for (int i = 0; i < products.length; i++) {//Empty 있는지 없는지 확인> 넣을 공간이 있는지
            if (products[i].equals(EMPTY)) {
                System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
                products[i] = s.nextLine();
                counts[i] = 0; // 제품이 등록되면 수량은 0으로 초기화
                System.out.println("[System] 등록이 완료됐습니다.");
                isRegistered = true;
                break;
            }
        }

        if (!isRegistered) {
            System.out.println("[System] 등록 가능한 갯수를 초과했습니다.");
        }

        prod_search(); // 제품 목록을 출력하여 확인
    }
    /**
     * 제품 등록을 취소하는 메서드입니다.
     * @param s Scanner 객체, 사용자로부터 취소할 제품명 입력을 받기 위해 사용됩니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     * 제품의 이름을 입력받아, products의 배열에서 요소를 초기화합니다 ("등록 가능"으로 변경)
     * 해당 제품의 수량도 0으로 변경해야 합니다. (counts 배열의 같은 index의 값을 0으로 변경합니다)
     */
    static void prod_remove(Scanner s) {
        // 제품 등록 취소 로직을 구현합니다. 입력받은 제품명에 해당하는 배열 요소를 EMPTY로 설정합니다.

        System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 : ");
        String p = s.nextLine();
        boolean isFound = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(p)) {
                products[i] = EMPTY; // 제품을 삭제
                counts[i] = 0; // 해당 제품의 수량을 0으로 설정
                System.out.println("[System] 제품 취소가 완료됐습니다.");
                isFound = true;
                break;
            }//다 empty일때 지울 품목이 없습니다 출력
        }

        if (!isFound) {
            System.out.println("[System] 해당하는 제품이 없습니다.");
        }

        prod_search(); // 현재 제품 목록을 출력
    }
    /**
     * 제품 수량을 증가시키는 메서드입니다.
     * @param s Scanner 객체를 통해 사용자로부터 제품명과 수량 입력을 받습니다.
     * products 배열에서 입력받은 요소를 찾아내어. counts 배열에서 해당 제품의 수량을 입력받은 수 만큼 증가시킵니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     */
    public static void prod_amount_add(Scanner s) {
        System.out.println("[System] 물건의 수량을 추가합니다.(입고)");
        prod_search(); // 현재 등록된 제품을 표시

        System.out.print("[System] 수량을 추가할 제품명을 입력하세요 : ");
        String input = s.nextLine();// 제품명 입력 받기
        int foundIdx = -1; // 찾은 인덱스 초기화

        for (int i = 0; i < products.length; i++) {
            if (input.equals(products[i])) { // 입력한 제품명과 일치하는 제품을 찾으면
                foundIdx = i; // 인덱스 저장
                break;// 반복 중단
            }
        }

        if (foundIdx < 0) { // 제품을 찾지 못한 경우
            System.out.println("[Warning] 입력한 제품명이 없습니다. 다시 확인하여 주세요.");
            return;
        }

        System.out.print("[System] 추가할 수량을 입력해주세요 : ");
        String c = s.nextLine();
        // 숫자가 아닌 경우, 에러 메시지를 출력해야 합니다.
        // TODO:유효성 검증 로직을 추가해야 합니다. (숫자가 아닌 입력이 발생할 시, 아래와 같이 출력하고 다시 입력이 이루어져야 합니다.

        if (!isNumeric(c)) { // 입력이 숫자인지 검증
            System.out.println("[Error] 숫자를 입력해주세요.");
            return; // 숫자가 아닌 경우 입력을 재요청
        }

        int cnt = Integer.parseInt(c);  // 수량 입력 받기
        counts[foundIdx] += cnt;  // 제품의 수량을 증가
        System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");

        prod_search();
    }
    /**
     * 제품 수량을 감소시키는 메서드입니다.
     * @param s Scanner 객체를 통해 사용자로부터 제품명과 수량 입력을 받습니다.
     * products 배열에서 입력받은 요소를 찾아내어.
     * counts 배열에서 해당 제품의 수량을 입력받은 수 만큼 감소시킵니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     */

    public static void prod_amount_decrease(Scanner s) {
        // 제품 수량 감축 로직을 구현합니다. 입력받은 수량만큼 해당 제품의 수량을 감소시킵니다.
        // 유효성 검증 로직을 추가해야 합니다. (숫자가 아닌 입력이 발생할 시, 아래와 같이 출력하고 다시 입력이 이루어져야 합니다.
        System.out.println("[System] 제품의 출고를 진행합니다.");
        prod_search();
        System.out.print(" 출고를 진행할 제품명을 입력하세요 : ");
        String input = s.nextLine();// 제품명 입력 받기
        int foundIdx = -1;// 찾은 인덱스 초기화
        for (int i = 0; i < products.length; i++) {// 입력한 제품명과 일치하는 제품을 찾으면
            if (input.equals(products[i])) {
                foundIdx = i; //  인덱스 저장
                break;// 반복 중단
            }
        }

        if (foundIdx < 0) {// 제품을 찾지 못한 경우
            System.out.println("[Error] 입력한 제품명이 없습니다.");
            return;
        }

        System.out.print("[System] 원하는 출고량을 입력하세요 : ");
        String c = s.nextLine();

        if (!isNumeric(c)) { // 숫자인지
            System.out.println("[Error] 숫자를 입력해주세요.");
            return; // 숫자가 아닌 경우 종료
        }
        // 숫자가 아닌 경우, 에러 메시지를 출력해야 합니다.
        // TODO:유효성 검증 로직을 추가해야 합니다. (숫자가 아닌 입력이 발생할 시, 아래와 같이 출력하고 다시 입력이 이루어져야 합니다.
        int cnt = Integer.parseInt(c);  // 수량 입력 받기
        if (cnt > counts[foundIdx]) {
            System.out.println("[Error] 출고 가능한 수량이 아닙니다.");
            return; // 유효하지 않은 경우 종료
        }

        counts[foundIdx] -= cnt;// 제품의 수량을 증가
        System.out.println("[Clear] 출고가 완료되었습니다.");

        prod_search();
    }


    static boolean isNumeric(String str) { // 문자열이 숫자인지 확인
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    /**
     * 등록된 모든 제품의 목록과 수량을 출력하는 메서드입니다.
     * 반환 타입은 void로, 별도의 반환 값이 없습니다.
     */
    static void prod_search() {
        System.out.println("[System] 현재 등록된 물건 목록 ▼");
        for (int i = 0; i < products.length; ++i) {
            System.out.println("> " + products[i] + " : " + counts[i] + "개");
        }
    }
    /**
     * 프로그램의 메인 메서드로, 프로그램의 실행 시작점입니다.
     */

    public static void main(String[] args) {
        System.out.println("[Item_Storage]");
        System.out.println("[System] 점장님, 어서오세요.");

        Scanner s = new Scanner(System.in);
        while (true) {
            showMenu();
            int menu = selectMenu(s);  // 메뉴 선택을 받습니다.
            if (menu == 6) { // '프로그램 종료' 선택 시
                System.out.println("[System] 프로그램을 종료합니다.");
                break; // 반복문을 종료하고 프로그램을 종료합니다.
            }
            // 선택된 메뉴에 따라 해당 기능을 실행합니다.
            switch (menu) {
                case 1:
                    prod_input(s);
                    break;
                case 2:
                    prod_remove(s);
                    break;
                case 3:
                    prod_amount_add(s);
                    break;
                case 4:
                    prod_amount_decrease(s);
                    break;
                case 5:
                    prod_search(); // 재고 조회
                    break;
                default:
                    System.out.println("[System] 잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
        s.close(); // Scanner 객체를 닫습니다.
    }
}
