package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertToNumberTest {

    ConvertToNumber test = new ConvertToNumber();

    @Test
    @DisplayName("'9'를 입력받은 경우 9를 리턴해야 합니다")
    void convertToNumber() {
        assertThat(test.convertToNumber('9') == 9).isTrue();
    }

    @Test
    @DisplayName("'4'를 입력받은 경우 4를 리턴해야 합니다")
    void convertToNumber2() {
        assertThat(test.convertToNumber('4') == 4).isTrue();
    }

    @Test
    @DisplayName("'1'를 입력받은 경우 1를 리턴해야 합니다")
    void convertToNumber3() {
        assertThat(test.convertToNumber('1') == 1).isTrue();
    }
}