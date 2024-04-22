package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class I_DaysInMonthTest {

    I_DaysInMonth test = new I_DaysInMonth();

    @Test
    @DisplayName("1을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth() {
        assertThat(test.daysInMonth(1)).isEqualTo(31);
    }

    @Test
    @DisplayName("2을(를) 입력받은 경우, 28을(를) 리턴해야 합니다")
    void daysInMonth2() {
        assertThat(test.daysInMonth(2)).isEqualTo(28);
    }

    @Test
    @DisplayName("3을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth3() {
        assertThat(test.daysInMonth(3)).isEqualTo(31);
    }

    @Test
    @DisplayName("4을(를) 입력받은 경우, 30을(를) 리턴해야 합니다")
    void daysInMonth4() {
        assertThat(test.daysInMonth(4)).isEqualTo(30);
    }

    @Test
    @DisplayName("5을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth5() {
        assertThat(test.daysInMonth(5)).isEqualTo(31);
    }

    @Test
    @DisplayName("6을(를) 입력받은 경우, 30을(를) 리턴해야 합니다")
    void daysInMonth6() {
        assertThat(test.daysInMonth(6)).isEqualTo(30);
    }

    @Test
    @DisplayName("7을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth7() {
        assertThat(test.daysInMonth(7)).isEqualTo(31);
    }

    @Test
    @DisplayName("8을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth8() {
        assertThat(test.daysInMonth(8)).isEqualTo(31);
    }

    @Test
    @DisplayName("9을(를) 입력받은 경우, 30을(를) 리턴해야 합니다")
    void daysInMonth9() {
        assertThat(test.daysInMonth(9)).isEqualTo(30);
    }

    @Test
    @DisplayName("10을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth10() {
        assertThat(test.daysInMonth(10)).isEqualTo(31);
    }

    @Test
    @DisplayName("11을(를) 입력받은 경우, 30을(를) 리턴해야 합니다")
    void daysInMonth11() {
        assertThat(test.daysInMonth(11)).isEqualTo(30);
    }

    @Test
    @DisplayName("12을(를) 입력받은 경우, 31을(를) 리턴해야 합니다")
    void daysInMonth12() {
        assertThat(test.daysInMonth(12)).isEqualTo(31);
    }

}
