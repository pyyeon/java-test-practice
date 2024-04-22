package conditionalStatement;

public class IfStatementsV3 {
    public static void main(String[] args) {
        boolean 조건식1 = false;
        boolean 조건식2 = true;
        if(조건식1) {
            //조건식1이 참이라면, 실행되는 블록입니다.
            System.out.println("조건식1이 true로 if문이 실행됩니다.");
        } else if (조건식2) {
            //조건식1이 참이 아니면서 조건식2가 참일 때, 실행되는 블록입니다.
            System.out.println("조건식2가 true로 else if문이 실행됩니다.");
        } else {
            //조건식1과 2가 모두 참이 아닐 때, 실행되는 블록입니다.
            //else문은 생략 가능합니다.
            System.out.println("두 조건이 모두 해당하지 않아, else문이 실행됩니다.");
        }
    }
}
