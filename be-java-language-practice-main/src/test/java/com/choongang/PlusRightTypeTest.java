package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusRightTypeTest {

    PlusRightType test = new PlusRightType();

    @Test
    @DisplayName("score는 100 이여야 합니다.")
    void plusRightType() {
        assertThat(test.plusRightType() == 100).isTrue();
    }
}