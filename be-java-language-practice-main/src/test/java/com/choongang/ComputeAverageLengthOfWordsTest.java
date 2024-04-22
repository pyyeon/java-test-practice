package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputeAverageLengthOfWordsTest {

    ComputeAverageLengthOfWords test = new ComputeAverageLengthOfWords();

    @Test
    @DisplayName("차례대로 \"chicken\", \"beers\"을(를) 입력받은 경우, 6을(를) 리턴해야 합니다")
    public void test() {
        assertThat(test.computeAverageLengthOfWords("chicken", "beers") == 6).isTrue();
    }

    @Test
    @DisplayName("차례대로 \"is\", \"this\"을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
    public void test_2() {
        assertThat(test.computeAverageLengthOfWords("is", "this") == 3).isTrue();
    }

}