
package com.jungmin;

public class B_IsGreaterThan30 {
    public String isGreaterThan30(int temp) {

      String output;

        if (temp < 30){
            output = "여름이 매우 덥네요" ;
        }
        else {
            output = "에어컨을 켜야겠다!";
        }
    return output;
    }
}

