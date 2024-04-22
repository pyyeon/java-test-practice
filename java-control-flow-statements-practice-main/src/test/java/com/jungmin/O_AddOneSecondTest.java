package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class O_AddOneSecondTest {

    O_AddOneSecond test = new O_AddOneSecond();

    @Test
    @DisplayName("addOneSecond(12, 16, 59) 는 \"1초 뒤에 12시 17분 0초 입니다\"을(를) 리턴해야 합니다")
    void addOneSecond() {
        assertThat(test.addOneSecond(12, 16, 59)).isEqualTo("1초 뒤에 12시 17분 0초 입니다");
    }
    @Test
    @DisplayName("addOneSecond(6, 59, 59) 는 \"1초 뒤에 7시 0분 0초 입니다\"을(를) 리턴해야 합니다")
    void addOneSecond2() {
        assertThat(test.addOneSecond(6, 59, 59)).isEqualTo("1초 뒤에 7시 0분 0초 입니다");
    }
    @Test
    @DisplayName("addOneSecond(13, 15, 32) 는 \"1초 뒤에 13시 15분 33초 입니다\"을(를) 리턴해야 합니다")
    void addOneSecond3() {
        assertThat(test.addOneSecond(13, 15, 32)).isEqualTo("1초 뒤에 13시 15분 33초 입니다");
    }
    @Test
    @DisplayName("addOneSecond(23, 59, 59) 는 \"1초 뒤에 0시 0분 0초 입니다\"을(를) 리턴해야 합니다")
    void addOneSecond4() {
        assertThat(test.addOneSecond(23, 59, 59)).isEqualTo("1초 뒤에 0시 0분 0초 입니다");
    }
}
/**/