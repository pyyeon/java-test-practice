package com.choongang;

public class Type {
    public String type() {
        int num = 3;
        char thing = 'A';
        //TODO : 변수 thing에 문자(char) 'A'를 할당하고, 변수 num에 숫자(int) 3을 할당합니다.
        // 아래 라인에 코드를 작성해 주세요.

        //아래 코드는 수정하지 말아야 합니다.
        return goCheck(num, thing);
    }

    //아래 메소드는 수정하지 말아야 합니다.
    public String goCheck(int num, char thing) {
        return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
    }
}
