//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class A_SumTest {
//
//    A_Sum test = new A_Sum();
//
//    @Test
//    @DisplayName("0을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void sumTo() {
//        assertThat(test.sumTo(0)).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("4을(를) 입력받은 경우, 10을(를) 리턴해야 합니다")
//    void sumTo2() {
//        assertThat(test.sumTo(4)).isEqualTo(10);
//    }
//
//    @Test
//    @DisplayName("77을(를) 입력받은 경우, 3003을(를) 리턴해야 합니다")
//    void sumTo3() {
//        assertThat(test.sumTo(77)).isEqualTo(3003);
//    }
//}