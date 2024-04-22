package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class E_MakeDigitsTest {

    E_MakeDigits test = new E_MakeDigits();
    @Test
    @DisplayName("1을(를) 입력받은 경우, \"1\"을(를) 리턴해야 합니다")
    void makeDigits() {
        assertThat(test.makeDigits(1)).isEqualTo("1");
    }

    @Test
    @DisplayName("5을(를) 입력받은 경우, \"12345\"을(를) 리턴해야 합니다")
    void makeDigits2() {
        assertThat(test.makeDigits(5)).isEqualTo("12345");
    }

    @Test
    @DisplayName("13을(를) 입력받은 경우, \"12345678910111213\"을(를) 리턴해야 합니다")
    void makeDigits3() {
        assertThat(test.makeDigits(13)).isEqualTo("12345678910111213");
    }
}