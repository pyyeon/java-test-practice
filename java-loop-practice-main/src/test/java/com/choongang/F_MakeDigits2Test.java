package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class F_MakeDigits2Test {

    F_MakeDigits2 test = new F_MakeDigits2();
    @Test
    @DisplayName("1을(를) 입력받은 경우, \"1\"을(를) 리턴해야 합니다")
    void makeDigits2() {
        assertThat(test.makeDigits2(1)).isEqualTo("1");
    }

    @Test
    @DisplayName("5을(를) 입력받은 경우, \"1-2-3-4-5\"을(를) 리턴해야 합니다")
    void makeDigits22() {
        assertThat(test.makeDigits2(5)).isEqualTo("1-2-3-4-5");
    }

    @Test
    @DisplayName("13을(를) 입력받은 경우, \"1-2-3-4-5-6-7-8-9-10-11-12-13\"을(를) 리턴해야 합니다")
    void makeDigits23() {
        assertThat(test.makeDigits2(13)).isEqualTo("1-2-3-4-5-6-7-8-9-10-11-12-13");
    }
}