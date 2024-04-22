//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class O_ComputePowerTest {
//
//    O_ComputePower test = new O_ComputePower();
//    @Test
//    @DisplayName("차례대로 -2, 0을(를) 입력받은 경우, 1을(를) 리턴해야 합니다")
//    void computePower() {
//        assertThat(test.computePower(-2, 0)).isEqualTo(1);
//    }
//
//    @Test
//    @DisplayName("차례대로 2, 4을(를) 입력받은 경우, 16을(를) 리턴해야 합니다")
//    void computePower2() {
//        assertThat(test.computePower(2, 4)).isEqualTo(16);
//    }
//
//    @Test
//    @DisplayName("차례대로 -2, 4을(를) 입력받은 경우, 16을(를) 리턴해야 합니다")
//    void computePower3() {
//        assertThat(test.computePower(-2, 4)).isEqualTo(16);
//    }
//}