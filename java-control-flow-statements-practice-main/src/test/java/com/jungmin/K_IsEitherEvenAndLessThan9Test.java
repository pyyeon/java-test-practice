package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class K_IsEitherEvenAndLessThan9Test {

    K_IsEitherEvenAndLessThan9 test = new K_IsEitherEvenAndLessThan9();

    @Test
    @DisplayName("차례대로 4, 3을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEitherEvenAndLessThan9() {
        assertThat(test.isEitherEvenAndLessThan9(4, 3)).isTrue();
    }

    @Test
    @DisplayName("차례대로 7, 0을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEitherEvenAndLessThan92() {
        assertThat(test.isEitherEvenAndLessThan9(7, 0)).isTrue();
    }

    @Test
    @DisplayName("차례대로 0, 5을(를) 입력받은 경우, true를 리턴해야 합니다")
    void isEitherEvenAndLessThan93() {
        assertThat(test.isEitherEvenAndLessThan9(0, 5)).isTrue();
    }

    @Test
    @DisplayName("차례대로 2, 11을(를) 입력받은 경우, false를 리턴해야 합니다")
    void isEitherEvenAndLessThan94() {
        assertThat(test.isEitherEvenAndLessThan9(2, 11)).isFalse();
    }
}
