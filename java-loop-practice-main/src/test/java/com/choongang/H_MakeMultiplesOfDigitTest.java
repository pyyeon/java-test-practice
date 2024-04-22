//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class H_MakeMultiplesOfDigitTest {
//
//    H_MakeMultiplesOfDigit test = new H_MakeMultiplesOfDigit();
//
//    @Test
//    @DisplayName("1을(를) 입력받은 경우, 빈 문자열을 리턴해야 합니다")
//    void makeMultiplesOfDigit() {
//        assertThat(test.makeMultiplesOfDigit(1)).isEqualTo("");
//    }
//
//    @Test
//    @DisplayName("3을(를) 입력받은 경우, \"3\"을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit2() {
//        assertThat(test.makeMultiplesOfDigit(3)).isEqualTo("3");
//    }
//
//    @Test
//    @DisplayName("9을(를) 입력받은 경우, \"369\"을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit3() {
//        assertThat(test.makeMultiplesOfDigit(9)).isEqualTo("369");
//    }
//
//    @Test
//    @DisplayName("25을(를) 입력받은 경우, \"3691215182124\"을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit4() {
//        assertThat(test.makeMultiplesOfDigit(25)).isEqualTo("3691215182124");
//    }
//
//    @Test
//    @DisplayName("55을(를) 입력받은 경우, \"369121518212427303336394245485154\"을(를) 리턴해야 합니다")
//    void makeMultiplesOfDigit5() {
//        assertThat(test.makeMultiplesOfDigit(55)).isEqualTo("369121518212427303336394245485154");
//    }
//}