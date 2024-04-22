package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class J_FollowingDayTest {

    J_FollowingDay test = new J_FollowingDay();

    @Test
    @DisplayName("\"화\"을(를) 입력받은 경우, \"올바른 요일이 아닙니다\"을(를) 리턴해야 합니다")
    void followingDay() {
        assertThat(test.followingDay("화")).isEqualTo("올바른 요일이 아닙니다");
    }

    @Test
    @DisplayName("\"101\"을(를) 입력받은 경우, \"올바른 요일이 아닙니다\"을(를) 리턴해야 합니다")
    void followingDay2() {
        assertThat(test.followingDay("101")).isEqualTo("올바른 요일이 아닙니다");
    }

    @Test
    @DisplayName("\"hello world\"을(를) 입력받은 경우, \"올바른 요일이 아닙니다\"을(를) 리턴해야 합니다")
    void followingDay3() {
        assertThat(test.followingDay("hello world")).isEqualTo("올바른 요일이 아닙니다");
    }

    @Test
    @DisplayName("\"금요일\"을(를) 입력받은 경우, \"토요일\"을(를) 리턴해야 합니다")
    void followingDay4() {
        assertThat(test.followingDay("금요일")).isEqualTo("토요일");
    }

    @Test
    @DisplayName("\"토요일\"을(를) 입력받은 경우, \"일요일\"을(를) 리턴해야 합니다")
    void followingDay5() {
        assertThat(test.followingDay("토요일")).isEqualTo("일요일");
    }

}
