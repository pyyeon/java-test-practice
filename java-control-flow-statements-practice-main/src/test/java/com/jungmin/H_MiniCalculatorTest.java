package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class H_MiniCalculatorTest {

    H_MiniCalculator test = new H_MiniCalculator();

    @Test
    @DisplayName("차례대로 2, 4, '-'을(를) 입력받은 경우, -2을(를) 리턴해야 합니다")
    void miniCalculator() {
        assertThat(test.miniCalculator(2, 4, '-')).isEqualTo(-2);
    }

    @Test
    @DisplayName("차례대로 5, 4, '*'을(를) 입력받은 경우, 20을(를) 리턴해야 합니다")
    void miniCalculator2() {
        assertThat(test.miniCalculator(5, 4, '*')).isEqualTo(20);
    }

    @Test
    @DisplayName("차례대로 1, 5, '+'을(를) 입력받은 경우, 6을(를) 리턴해야 합니다")
    void miniCalculator3() {
        assertThat(test.miniCalculator(1, 5, '+')).isEqualTo(6);
    }

    @Test
    @DisplayName("차례대로 28, 7, '/'을(를) 입력받은 경우, 4을(를) 리턴해야 합니다")
    void miniCalculator4() {
        assertThat(test.miniCalculator(28, 7, '/')).isEqualTo(4);
    }

    @Test
    @DisplayName("차례대로 9, 3, '%'을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
    void miniCalculator5() {
        assertThat(test.miniCalculator(9, 3, '%')).isEqualTo(-0);
    }
}
