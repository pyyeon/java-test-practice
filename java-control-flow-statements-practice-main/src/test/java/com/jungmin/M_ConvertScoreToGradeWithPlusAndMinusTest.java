package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class M_ConvertScoreToGradeWithPlusAndMinusTest {

    M_ConvertScoreToGradeWithPlusAndMinus test = new M_ConvertScoreToGradeWithPlusAndMinus();

    @Test
    @DisplayName("101을(를) 입력받은 경우, 'INVALID SCORE'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(101)).isEqualTo("INVALID SCORE");
    }

    @Test
    @DisplayName("100을(를) 입력받은 경우, 'A+'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus2() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(100)).isEqualTo("A+");
    }

    @Test
    @DisplayName("62을(를) 입력받은 경우, 'D-'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus3() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(62)).isEqualTo("D-");
    }

    @Test
    @DisplayName("79을(를) 입력받은 경우, 'C+'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus4() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(79)).isEqualTo("C+");
    }

    @Test
    @DisplayName("52을(를) 입력받은 경우, 'F'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus5() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(52)).isEqualTo("F");
    }

    @Test
    @DisplayName("74을(를) 입력받은 경우, 'C'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus6() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(74)).isEqualTo("C");
    }

    @Test
    @DisplayName("0을(를) 입력받은 경우, 'F'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus7() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(0)).isEqualTo("F");
    }

    @Test
    @DisplayName("81을(를) 입력받은 경우, 'B-'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus8() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(81)).isEqualTo("B-");
    }

    @Test
    @DisplayName("69을(를) 입력받은 경우, 'D+'을(를) 리턴해야 합니다")
    void convertScoreToGradeWithPlusAndMinus9() {
        assertThat(test.convertScoreToGradeWithPlusAndMinus(69)).isEqualTo("D+");
    }
}
