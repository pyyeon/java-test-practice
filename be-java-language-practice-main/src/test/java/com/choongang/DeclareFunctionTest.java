package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeclareFunctionTest {

    DeclareFunction test = new DeclareFunction();

    @Test
    @DisplayName("첫 번째 인자를 2로 나누는 divideBy2 함수를 선언해야 합니다")
    void devideBy2() {
        assertThat(test.devideBy2(10) == 5).isTrue();
    }

    @Test
    @DisplayName("첫 번째 인자를 2로 나누는 divideBy2 함수를 선언해야 합니다")
    void devideBy2_2() {
        assertThat(test.devideBy2(20) == 10).isTrue();
    }
}