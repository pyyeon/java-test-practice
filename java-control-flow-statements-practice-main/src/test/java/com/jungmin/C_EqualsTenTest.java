package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class C_EqualsTenTest {

    C_EqualsTen test = new C_EqualsTen();

    @Test
    @DisplayName("10을(를) 입력받은 경우, true를 리턴해야 합니다")
    void equalsTen() {
        assertThat(test.equalsTen(10)).isTrue();
    }

    @Test
    @DisplayName("400을(를) 입력받은 경우, false를 리턴해야 합니다")
    void equalsTen2() {
        assertThat(test.equalsTen(140)).isFalse();
    }

    @Test
    @DisplayName("3을(를) 입력받은 경우, false를 리턴해야 합니다")
    void equalsTen3() {
        assertThat(test.equalsTen(3)).isFalse();
    }
}
