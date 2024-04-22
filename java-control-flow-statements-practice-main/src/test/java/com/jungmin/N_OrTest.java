package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class N_OrTest {

    N_Or test = new N_Or();

    @Test
    @DisplayName("차례대로 false, true 입력받은 경우, true를 리턴해야 합니다")
    void or() {
        assertThat(test.or(false, true)).isTrue();
    }

    @Test
    @DisplayName("차례대로 true, true 입력받은 경우, true를 리턴해야 합니다")
    void or2() {
        assertThat(test.or(true, true)).isTrue();
    }

    @Test
    @DisplayName("차례대로 true, false를 입력받은 경우, true를 리턴해야 합니다")
    void or3() {
        assertThat(test.or(true, false)).isTrue();
    }

    @Test
    @DisplayName("차례대로 false, false 입력받은 경우, false를 리턴해야 합니다")
    void or4() {
        assertThat(test.or(false, false)).isFalse();
    }
}
