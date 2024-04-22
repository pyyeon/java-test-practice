package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class L_ConvertScoreToGradeTest {

    L_ConvertScoreToGrade test = new L_ConvertScoreToGrade();

    @Test
    @DisplayName("101을(를) 입력받은 경우, 'X'을(를) 리턴해야 합니다")
    void convertScoreToGrade() {
        assertThat(test.convertScoreToGrade(101)).isEqualTo('X');
    }

    @Test
    @DisplayName("100을(를) 입력받은 경우, 'A'을(를) 리턴해야 합니다")
    void convertScoreToGrade2() {
        assertThat(test.convertScoreToGrade(100)).isEqualTo('A');
    }

    @Test
    @DisplayName("-1을(를) 입력받은 경우, 'X'을(를) 리턴해야 합니다")
    void convertScoreToGrade3() {
        assertThat(test.convertScoreToGrade(-1)).isEqualTo('X');
    }

    @Test
    @DisplayName("62을(를) 입력받은 경우, 'D'을(를) 리턴해야 합니다")
    void convertScoreToGrade4() {
        assertThat(test.convertScoreToGrade(62)).isEqualTo('D');
    }

    @Test
    @DisplayName("59을(를) 입력받은 경우, 'F'을(를) 리턴해야 합니다")
    void convertScoreToGrade5() {
        assertThat(test.convertScoreToGrade(59)).isEqualTo('F');
    }
}
