package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShowTimeTest {
    ShowTime showTime = new ShowTime();

    @Test
    @DisplayName("차례대로 5, 30, 56을(를) 입력받은 경우, \"현재 시각은 5시 30분 56초 입니다.\"을(를) 리턴해야 합니다")
    public void test_1() {
        assertThat(showTime.showTime(5, 30, 56).equals("현재 시각은 5시 30분 56초 입니다.")).isTrue();
    }

    @Test
    @DisplayName("차례대로 1, 2, 3을(를) 입력받은 경우, \"현재 시각은 1시 2분 3초 입니다.\"을(를) 리턴해야 합니다")
    public void test_2() {
        assertThat(showTime.showTime(1, 2, 3).equals("현재 시각은 1시 2분 3초 입니다.")).isTrue();
    }

}