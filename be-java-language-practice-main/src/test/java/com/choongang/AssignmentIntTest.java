package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AssignmentIntTest {

    AssignmentInt test;

    @BeforeEach
    void setUp() {
        // 테스트가 실행되기 전에 Expression 객체를 초기화하고 expression 메서드를 호출합니다.
        test = new AssignmentInt();
        test.assignment();
    }

    @Test
    @DisplayName("변수 num에 정수 100을 할당하세요")
    void expression() {
        assertThat(test.num).isEqualTo(100);
    }
}