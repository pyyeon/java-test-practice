package com.choongang;
//(초기화);
//while(조건식) {
//  실행문; //조건식이 참인 동안 실행
//  증감식;
//}
public class F_MakeDigits2 {
    public String makeDigits2(int num) {
        // TODO: 수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴해야 합니다.
    String str = "";
    int idx = 1;
        while ( idx <= num ){
            if (idx == num){
                str = str + idx;
            }else {
                str = str + idx + '-'; //문자열 자르는 방법 검색
            }idx++;
    }
      //  str = str.substring(0,str.length()-1);//length()-1은 항상 마지막 인덱스
return str;
    }
}
