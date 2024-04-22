package com.choongang;

public class G_MakeOddDigits {
    public String makeOddDigits(int num) {
        // TODO:수(num)를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴해야 합니다.
        String str = "";
        int count = 0;
        int currentNum = 1;

        while (count < num){
            str = str + currentNum;

            count++;
           currentNum =currentNum + 2;
        }
        return str;
    }
}
