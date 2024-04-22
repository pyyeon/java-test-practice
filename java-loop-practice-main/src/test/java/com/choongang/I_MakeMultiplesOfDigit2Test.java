//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class I_MakeMultiplesOfDigit2Test {
//
//    I_MakeMultiplesOfDigit2 test = new I_MakeMultiplesOfDigit2();
//
//    @Test
//    @DisplayName("차례대로 0, 0을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit2() {
//        assertThat(test.makeMultiplesOfDigit2(0, 0)).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("차례대로 0, 1을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit22() {
//        assertThat(test.makeMultiplesOfDigit2(0, 1)).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("차례대로 1, 0을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit23() {
//        assertThat(test.makeMultiplesOfDigit2(1, 0)).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("차례대로 9, 3을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit24() {
//        assertThat(test.makeMultiplesOfDigit2(9, 3)).isEqualTo(3);
//    }
//
//    @Test
//    @DisplayName("차례대로 8, 8을(를) 입력받은 경우, 1을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit25() {
//        assertThat(test.makeMultiplesOfDigit2(8, 8)).isEqualTo(1);
//    }
//
//    @Test
//    @DisplayName("차례대로 12, 0을(를) 입력받은 경우, 6을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit26() {
//        assertThat(test.makeMultiplesOfDigit2(12, 0)).isEqualTo(6);
//    }
//}