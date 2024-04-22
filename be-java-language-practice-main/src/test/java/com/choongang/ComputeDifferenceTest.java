package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputeDifferenceTest {
    ComputeDifference computeDifference = new ComputeDifference();
//    @Test
//    @DisplayName("")
//    public void test_1() {
//        assertThat().isTrue();
//    }

    @Test
    @DisplayName("차례대로 2, 10을(를) 입력받은 경우, \"2, 10의 차이는 8입니다.\"을(를) 리턴해야 합니다")
    public void test_1() {
        assertThat(computeDifference.computeDifference(2, 10).equals("2, 10의 차이는 8입니다.")).isTrue();
    }

    @Test
    @DisplayName("차례대로 10, 2을(를) 입력받은 경우, \"10, 2의 차이는 8입니다.\"을(를) 리턴해야 합니다")
    public void test_2() {
        assertThat(computeDifference.computeDifference(10, 2).equals("10, 2의 차이는 8입니다.")).isTrue();
    }
}