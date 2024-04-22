package com.choongang;

public class CallFunction {
    public String invoke() {
        String word = "qwsd" ;
        // 문자열을 인자로 받아서 느낌표를 붙여서 리턴 해주는 메서드 returnWordWithJoy가 있습니다.
        // 메서드 returnWordWithJoy의 첫 번째 인자로 문자열 "I love coding"을 넣어서 호출하고, 그 결과값을 변수 word에 할당하세요
        //TODO : 아래 라인에 코드를 작성해 주세요.

        //아래 코드는 수정하지 말아야 합니다.
        return word  ;
    }

    //아래의 메서드는 수정하지 말아야 합니다.
    public static String returnWordWithJoy(String str) {
        if(str.equals("")) return "empty value";
        else return str + "!";
    }
}
