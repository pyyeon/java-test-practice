package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExpressionTest {

    Expression test;

    @BeforeEach
    void setUp() {
        // 테스트가 실행되기 전에 Expression 객체를 초기화하고 expression 메서드를 호출합니다.
        test = new Expression();
        test.expression();
    }

    @Test
    @DisplayName("num1에 5를 할당하여야 합니다")
    void expression() {
        assertThat(test.num1).isEqualTo(5);
    }

    @Test
    @DisplayName("num2에 7을 할당하여야 합니다")
    void expression2() {
        assertThat(test.num2).isEqualTo(7);
    }

    @Test
    @DisplayName("result는 num1과 num2의 덧셈과 같아야 합니다")
    void expression3() {
        assertThat(test.result).isEqualTo(test.num1 + test.num2);
    }
}