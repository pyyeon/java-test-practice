package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class D_isGreaterThanTest {

    D_IsGreaterThan test = new D_IsGreaterThan();

    @Test
    @DisplayName("차례대로 20, 20을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isGreaterThan() {
        assertThat(test.isGreaterThan(20, 20)).isFalse();
    }

    @Test
    @DisplayName("차례대로 1, 2을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isGreaterThan2() {
        assertThat(test.isGreaterThan(1, 2)).isTrue();
    }

    @Test
    @DisplayName("차례대로 11, 10을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isGreaterThan3() {
        assertThat(test.isGreaterThan(11, 10)).isFalse();
    }
}
