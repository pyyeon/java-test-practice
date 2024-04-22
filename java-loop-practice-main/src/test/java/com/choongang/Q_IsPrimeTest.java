//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class Q_IsPrimeTest {
//
//    Q_IsPrime test = new Q_IsPrime();
//    @Test
//    @DisplayName("1을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isPrime() {
//        assertThat(test.isPrime(1)).isFalse();
//    }
//
//    @Test
//    @DisplayName("4을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isPrime2() {
//        assertThat(test.isPrime(4)).isFalse();
//    }
//
//    @Test
//    @DisplayName("97을(를) 입력받은 경우, true를 리턴해야 합니다")
//    void isPrime3() {
//        assertThat(test.isPrime(97)).isTrue();
//    }
//
//    @Test
//    @DisplayName("11587을(를) 입력받은 경우, true를 리턴해야 합니다")
//    void isPrime4() {
//        assertThat(test.isPrime(11587)).isTrue();
//    }
//
//    @Test
//    @DisplayName("12887을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void isPrime5() {
//        assertThat(test.isPrime(12887)).isFalse();
//    }
//}