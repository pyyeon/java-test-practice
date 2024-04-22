//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.InstanceOfAssertFactories.list;
//
//class B_IsOddTest {
//
//    B_IsOdd test = new B_IsOdd();
//
//    @Test
//    @DisplayName("77을(를) 입력받은 경우, true를 리턴해야 합니다")
//    void isOdd() {
//        assertThat(test.isOdd(77)).isTrue();
//    }
//
//    @Test
//    @DisplayName("100을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isOdd2() {
//        assertThat(test.isOdd(100)).isFalse();
//    }
//
//    @Test
//    @DisplayName("0을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isOdd3() {
//        assertThat(test.isOdd(0)).isFalse();
//    }
//
//    @Test
//    @DisplayName("-17을(를) 입력받은 경우, true를 리턴해야 합니다")
//    void isOdd4() {
//        assertThat(test.isOdd(-17)).isTrue();
//    }
//
//    @Test
//    @DisplayName("-1000을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isOdd5() {
//        assertThat(test.isOdd(-1000)).isFalse();
//    }
//}