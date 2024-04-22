package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetRunCatDistanceTest {

    GetRunCatDistance test = new GetRunCatDistance();

    @Test
    @DisplayName("getRunCatDistance 함수는 spped와 time를 곱한 값을 변수 result에 할당해야 합니다")
    void getRunCatDistance() {
        assertThat(test.getRunCatDistance(5, 10) == 50).isTrue();
    }

    @Test
    @DisplayName("getRunCatDistance 함수는 spped와 time를 곱한 값을 변수 result에 할당해야 합니다")
    void getRunCatDistance2() {
        assertThat(test.getRunCatDistance(3, 7) == 21).isTrue();
    }
}