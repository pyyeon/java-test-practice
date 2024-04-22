package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class B_IsGreaterThan30Test {

    B_IsGreaterThan30 test = new B_IsGreaterThan30();
    @Test
    @DisplayName("30을(를) 입력받은 경우, '에어컨을 켜야겠다!'을(를) 리턴해야 합니다")
    void isGreaterThan30() {
        assertThat(test.isGreaterThan30(30)).isEqualTo("에어컨을 켜야겠다!");
    }

    @Test
    @DisplayName("5000을(를) 입력받은 경우, '에어컨을 켜야겠다!'을(를) 리턴해야 합니다")
    void isGreaterThan302() {
        assertThat(test.isGreaterThan30(5000)).isEqualTo("에어컨을 켜야겠다!");
    }

    @Test
    @DisplayName("-30을(를) 입력받은 경우, '여름이 매우 덥네요'을(를) 리턴해야 합니다")
    void isGreaterThan303() {
        assertThat(test.isGreaterThan30(-30)).isEqualTo("여름이 매우 덥네요");
    }

    @Test
    @DisplayName("29을(를) 입력받은 경우, '여름이 매우 덥네요'을(를) 리턴해야 합니다")
    void isGreaterThan304() {
        assertThat(test.isGreaterThan30(29)).isEqualTo("여름이 매우 덥네요");
    }

    @Test
    @DisplayName("0을(를) 입력받은 경우, '여름이 매우 덥네요'을(를) 리턴해야 합니다")
    void isGreaterThan305() {
        assertThat(test.isGreaterThan30(0)).isEqualTo("여름이 매우 덥네요");
    }
}
