//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class L_GetMaxNumberFromStringTest {
//
//    L_GetMaxNumberFromString test = new L_GetMaxNumberFromString();
//
//    @Test
//    @DisplayName("\"1234\"을(를) 입력받은 경우, 숫자 4을(를) 리턴해야 합니다")
//    void getMaxNumberFromString() {
//        assertThat(test.getMaxNumberFromString("1234")).isEqualTo(4);
//    }
//
//    @Test
//    @DisplayName("\"12375\"을(를) 입력받은 경우, 숫자 7을(를) 리턴해야 합니다")
//    void getMaxNumberFromString2() {
//        assertThat(test.getMaxNumberFromString("12375")).isEqualTo(7);
//    }
//
//    @Test
//    @DisplayName("빈 문자열을 입력받은 경우, 숫자 0을(를) 리턴해야 합니다")
//    void getMaxNumberFromString3() {
//        assertThat(test.getMaxNumberFromString("")).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("\"424257278\"을(를) 입력받은 경우, 숫자 8을(를) 리턴해야 합니다")
//    void getMaxNumberFromString4() {
//        assertThat(test.getMaxNumberFromString("424257278")).isEqualTo(8);
//    }
//}