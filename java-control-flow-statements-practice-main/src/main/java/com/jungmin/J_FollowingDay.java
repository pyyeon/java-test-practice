package com.jungmin;

public class J_FollowingDay {
    public String followingDay(String day) {
         switch (day){
            case "월요일":
                return "화요일";
            case "화요일":
                return "수요일";
            case "수요일":
                return "목요일";
            case "목요일":
                return "금요일";
            case "금요일":
                return "토요일";
            case "토요일":
                return "일요일";
            case "일요일":
                return "월요일";
            default:
              return   "올바른 요일이 아닙니다";
        }
        /*
        String str = "올바른 요일이 아닙니다."; //먼저 예외처리(초기화)하고 시작
        if조건문
        str=""
        return str;
        */
        //배열로도 풀 수 있음(하루씩증가)

    }
}
