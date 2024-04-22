package com.jungmin;

public class K_IsEitherEvenAndLessThan9 {
    public boolean isEitherEvenAndLessThan9(int num1, int num2) {
        //num1,num2 둘중 하나라도 짝수&&num1,num2두수모두 9보다 작아야함
        if (num1 % 2 ==0 || num2 % 2 == 0){
            if (num1 < 9 && num2 <9){
                return true;
            }
            else {
                return false;
            }

        }
        else {
            return false;

        /*
        boolean result = false;
        if((num1 & 2 == 0 || num2 % 2 ==0)&&(num1<9 &&num2 <9))
        {
                result = true;
            }
        return result;
        */
        }
    }
}
