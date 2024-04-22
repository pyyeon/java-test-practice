package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CallFunctionTest {

    CallFunction test = new CallFunction();

    @Test
    @DisplayName("문자열 'I love coding'을 첫 번째 인자로 넣어 \"I love coding!\"을 리턴해야 합니다")
    void invoke() {
        assertThat(test.invoke().equals("I love coding!")).isTrue();
    }
}