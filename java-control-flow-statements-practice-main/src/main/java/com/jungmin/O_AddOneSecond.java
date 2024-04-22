package com.jungmin;

public class O_AddOneSecond {
    public String addOneSecond(int hour, int minute, int second) {
        //1초씩 증가
        //59초일때 1분증가, 59분 59초일때는 1시간 증가
        //1. 1시0분0초 단순히 1초증가
        //2. 1시 0분 59초 1분증가
        //3.59분 59초일때는 1시간 증가
       second++; // 공통적으로 1초증가


        if(second == 60){
            minute++;
            second = 0;
        }
        if (minute == 60){  //else if는 하나의 덩어리로 만들기때문에 하위조건을 실행되지 않기때문. 또다른 조건으로 해야함.
            hour++;
            minute = 0;
        }
        if (hour == 24){
            hour = 0;
        }
        return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour,minute,second);
       /* if (0 <= hour && hour <= 24) {


        }
        if (0 <= minute && minute < 60){

        }
        if (0 <= second && second < 60){

        }
return ("1초 뒤에 %d시 %d분 %d초 입니다",hour,minute,second );

  */
   }

}
