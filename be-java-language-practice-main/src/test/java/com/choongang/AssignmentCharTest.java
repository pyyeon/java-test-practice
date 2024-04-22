package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssignmentCharTest {

    AssignmentChar test;

    @BeforeEach
    void setUp() {
        // 테스트가 실행되기 전에 Expression 객체를 초기화하고 expression 메서드를 호출합니다.
        test = new AssignmentChar();
        test.assignment();
    }

    @Test
    @DisplayName("변수 course에 문자 'A'를 할당하세요")
    void expression() {
        assertThat(test.course).isEqualTo('A');
    }
}