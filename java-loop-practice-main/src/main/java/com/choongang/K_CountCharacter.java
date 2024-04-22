package com.choongang;

public class K_CountCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:문자열과 문자를 입력받아 문자열에서 문자(letter)가 등장하는 횟수를 리턴해야 합니다.
int count = 0;
   for (int i = 0; i < str.length(); i++ ){
       if(str.charAt(i) == letter){//charAt()는 문자번호
       count++;
       }

   }
        return count;
    }
}
