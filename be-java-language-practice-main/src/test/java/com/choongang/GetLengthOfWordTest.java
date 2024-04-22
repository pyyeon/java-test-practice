package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetLengthOfWordTest {

    GetLengthOfWord test = new GetLengthOfWord();

    @Test
    @DisplayName("\"\"을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
    void getLengthOfWord() {
        assertThat(test.getLengthOfWord("") == 0).isTrue();
    }

    @Test
    @DisplayName("\"random\"을(를) 입력받은 경우, 6을(를) 리턴해야 합니다")
    void getLengthOfWord2() {
        assertThat(test.getLengthOfWord("random") == 6).isTrue();
    }

    @Test
    @DisplayName("\"javascript\"을(를) 입력받은 경우, 10을(를) 리턴해야 합니다")
    void getLengthOfWord3() {
        assertThat(test.getLengthOfWord("javascript") == 10).isTrue();
    }
}