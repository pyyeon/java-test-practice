package conditionalStatement;

public class IfStatementsV4 {
    public static void main(String[] args) {
        boolean isValid = false;
        boolean isExpired = true;
        if(isValid && isExpired) {
            //조건식1이 참이라면, 실행되는 블록입니다.
            System.out.println("isValid와 isExpired 두 값이 모두 true로 if문이 실행됩니다.");
        } else if (isValid || isExpired) {
            //조건식1이 참이 아니면서 조건식2가 참일 때, 실행되는 블록입니다.
            System.out.println("isValid와 isExpired 두 값중 하나의 값이 true로 else if문이 실행됩니다.");
        } else {
            //조건식1과 2가 모두 참이 아닐 때, 실행되는 블록입니다.
            //else문은 생략 가능합니다.
            System.out.println("isValid와 isExpired 두 값이 모두 false로 else문이 실행됩니다.");
        }
    }
}
