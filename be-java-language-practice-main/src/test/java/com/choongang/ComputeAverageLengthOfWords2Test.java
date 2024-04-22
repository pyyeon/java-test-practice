package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputeAverageLengthOfWords2Test {
    ComputeAverageLengthOfWords2 test = new ComputeAverageLengthOfWords2();

    @Test
    @DisplayName("차례대로 \"was\", \"this\"을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
    void computeAverageLengthOfWords2() {
        assertThat(test.computeAverageLengthOfWords2("was","this") == 3).isTrue();
    }

    @Test
    @DisplayName("차례대로 \"chicken\", \"beer\"을(를) 입력받은 경우, 5을(를) 리턴해야 합니다")
    void computeAverageLengthOfWords2_2() {
        assertThat(test.computeAverageLengthOfWords2("chicken","beer") == 5).isTrue();
    }

    @Test
    @DisplayName("차례대로 \"is\", \"this\"을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
    void computeAverageLengthOfWords2_3() {
        assertThat(test.computeAverageLengthOfWords2("is","this") == 3).isTrue();
    }
}