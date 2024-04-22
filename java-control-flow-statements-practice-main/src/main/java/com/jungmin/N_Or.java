package com.jungmin;
//둘중에 하나라도 t면 t 그 외에는 f
//둘다 f일때를 제외하면 t
public class N_Or {
    public boolean or(boolean expression1, boolean expression2) {

        if(!expression1 && !expression2){
            return false;//!expression1은 expresion1이 false라면 이라는 뜻이다.
        }
        else {
            return true;
        }
    }
}
