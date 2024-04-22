package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class E_isEvenTest {

    E_IsEven test = new E_IsEven();

    @Test
    @DisplayName("44을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEven() {
        assertThat(test.isEven(44)).isTrue();
    }

    @Test
    @DisplayName("1을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEven2() {
        assertThat(test.isEven(1)).isFalse();
    }

    @Test
    @DisplayName("2을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEven3() {
        assertThat(test.isEven(2)).isTrue();
    }

    @Test
    @DisplayName("55을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEven4() {
        assertThat(test.isEven(55)).isFalse();
    }

    @Test
    @DisplayName("0을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEven5() {
        assertThat(test.isEven(0)).isTrue();
    }
}
