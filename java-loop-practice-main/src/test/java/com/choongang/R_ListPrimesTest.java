//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class R_ListPrimesTest {
//
//    R_ListPrimes test = new R_ListPrimes();
//    @Test
//    @DisplayName("3을(를) 입력받은 경우, \"2-3\"를 리턴해야 합니다")
//    void listPrimes() {
//        assertThat(test.listPrimes(3)).isEqualTo("2-3");
//    }
//
//    @Test
//    @DisplayName("4을(를) 입력받은 경우, \"2-3\"를 리턴해야 합니다")
//    void listPrimes2() {
//        assertThat(test.listPrimes(4)).isEqualTo("2-3");
//    }
//
//    @Test
//    @DisplayName("12을(를) 입력받은 경우, \"2-3-5-7-11\"를 리턴해야 합니다")
//    void listPrimes3() {
//        assertThat(test.listPrimes(12)).isEqualTo("2-3-5-7-11");
//    }
//
//    @Test
//    @DisplayName("2을(를) 입력받은 경우, \"2\"를 리턴해야 합니다")
//    void listPrimes4() {
//        assertThat(test.listPrimes(2)).isEqualTo("2");
//    }
//
//    @Test
//    @DisplayName("22을(를) 입력받은 경우, \"2-3-5-7-11-13-17-19\"를 리턴해야 합니다")
//    void listPrimes5() {
//        assertThat(test.listPrimes(22)).isEqualTo("2-3-5-7-11-13-17-19");
//    }
//
//    @Test
//    @DisplayName("46을(를) 입력받은 경우, \"2-3-5-7-11-13-17-19-23-29-31-37-41-43\"를 리턴해야 합니다")
//    void listPrimes6() {
//        assertThat(test.listPrimes(46)).isEqualTo("2-3-5-7-11-13-17-19-23-29-31-37-41-43");
//    }
//}