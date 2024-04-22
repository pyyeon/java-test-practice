package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class F_IsEvenAndGreaterThanTenTest {

    F_IsEvenAndGreaterThanTen test = new F_IsEvenAndGreaterThanTen();

    @Test
    @DisplayName("80을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEvenAndGreaterThanTen() {
        assertThat(test.isEvenAndGreaterThanTen(80)).isTrue();
    }

    @Test
    @DisplayName("8을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEvenAndGreaterThanTen2() {
        assertThat(test.isEvenAndGreaterThanTen(8)).isFalse();
    }

    @Test
    @DisplayName("10을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEvenAndGreaterThanTen3() {
        assertThat(test.isEvenAndGreaterThanTen(10)).isFalse();
    }

    @Test
    @DisplayName("9을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEvenAndGreaterThanTen4() {
        assertThat(test.isEvenAndGreaterThanTen(9)).isFalse();
    }

    @Test
    @DisplayName("11을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEvenAndGreaterThanTen5() {
        assertThat(test.isEvenAndGreaterThanTen(11)).isFalse();
    }
}
