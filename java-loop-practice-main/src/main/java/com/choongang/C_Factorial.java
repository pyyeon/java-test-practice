package com.choongang;

public class C_Factorial {
    public int factorial(int num) {
        int result = 1;
       // TODO:수를 입력받아 n-factorial(n!) 값을 리턴해야 합니다.
   for (int i = 1; i <= num; i++){
       result *= i;
        }
        return result;
    }
}
