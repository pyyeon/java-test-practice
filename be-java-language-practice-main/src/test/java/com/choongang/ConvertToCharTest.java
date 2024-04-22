package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertToCharTest {

    ConvertToChar test = new ConvertToChar();

    @Test
    @DisplayName("9를 입력받으면 '9'를 리턴해야 합니다")
    void convertToChar() {
        assertThat(test.convertToChar(9) == '9').isTrue();
    }

    @Test
    @DisplayName("4를 입력받으면 '4'를 리턴해야 합니다")
    void convertToChar2() {
        assertThat(test.convertToChar(4) == '4').isTrue();
    }

    @Test
    @DisplayName("1를 입력받으면 '1'를 리턴해야 합니다")
    void convertToChar3() {
        assertThat(test.convertToChar(1) == '1').isTrue();
    }
}