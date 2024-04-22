package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class C_FactorialTest {

    C_Factorial test = new C_Factorial();

    @Test
    @DisplayName("0을(를) 입력받은 경우, 1을(를) 리턴해야 합니다")
    void factorial() {
        assertThat(test.factorial(0)).isEqualTo(1);
    }

    @Test
    @DisplayName("4을(를) 입력받은 경우, 24을(를) 리턴해야 합니다")
    void factorial2() {
        assertThat(test.factorial(4)).isEqualTo(24);
    }

    @Test
    @DisplayName("10을(를) 입력받은 경우, 3628800을(를) 리턴해야 합니다")
    void factorial3() {
        assertThat(test.factorial(10)).isEqualTo(3628800);
    }
}