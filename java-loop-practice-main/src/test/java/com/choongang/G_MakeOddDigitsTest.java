package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class G_MakeOddDigitsTest {

    G_MakeOddDigits test = new G_MakeOddDigits();

    @Test
    @DisplayName("1을(를) 입력받은 경우, \"1\"을(를) 리턴해야 합니다")
    void makeOddDigits() {
        assertThat(test.makeOddDigits(1)).isEqualTo("1");
    }

    @Test
    @DisplayName("5을(를) 입력받은 경우, \"13579\"을(를) 리턴해야 합니다")
    void makeOddDigits2() {
        assertThat(test.makeOddDigits(5)).isEqualTo("13579");
    }

    @Test
    @DisplayName("7을(를) 입력받은 경우, \"135791113\"을(를) 리턴해야 합니다")
    void makeOddDigits3() {
        assertThat(test.makeOddDigits(7)).isEqualTo("135791113");
    }

    @Test
    @DisplayName("25을(를) 입력받은 경우, \"135791113151719212325272931333537394143454749\"을(를) 리턴해야 합니다")
    void makeOddDigits4() {
        assertThat(test.makeOddDigits(25)).isEqualTo("135791113151719212325272931333537394143454749");
    }
}