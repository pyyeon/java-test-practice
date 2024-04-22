package com.choongang;

public class D_RepeatString {
    public String repeatString(String str, int num) {
        // TODO:문자열과 수를 입력받아 반복된 문자열을 리턴해야 합니다.
        String result = "";
        if (num == 0 || str.isEmpty()) {
            return "";
        } else {
            for (int i = 1; i <= num; i++) {
                result += str;

            }
            return result;
        }
        //result = str.repeat(num);
    }

}
