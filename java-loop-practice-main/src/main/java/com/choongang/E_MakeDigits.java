package com.choongang;
 //for (초기화; 조건식; 증감식)
public class E_MakeDigits {
    //문자열에 붙으면 강제로 문자열로 취급
    public String makeDigits(int num) {
        // TODO:수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴해야 합니다.
        String result = ""; //result가 문자열이라고 선언
        for (int i = 1; i <= num; i++){
        result += i;
    }
        return result;
    }
}
