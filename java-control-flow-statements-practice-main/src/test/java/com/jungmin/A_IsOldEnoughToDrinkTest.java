package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A_IsOldEnoughToDrinkTest {

    A_IsOldEnoughToDrink test = new A_IsOldEnoughToDrink();

    @Test
    @DisplayName("17을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isOldEnoughToDrink() {
        assertThat(test.isOldEnoughToDrink(17)).isFalse();
    }

    @Test
    @DisplayName("20을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isOldEnoughToDrink2() {
        assertThat(test.isOldEnoughToDrink(20)).isTrue();
    }

    @Test
    @DisplayName("18을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isOldEnoughToDrink3() {
        assertThat(test.isOldEnoughToDrink(18)).isTrue();
    }
}