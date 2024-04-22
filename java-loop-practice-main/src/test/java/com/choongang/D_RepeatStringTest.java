package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class D_RepeatStringTest {

    D_RepeatString test = new D_RepeatString();

    @Test
    @DisplayName("차례대로 \"what\", 3을(를) 입력받은 경우, \"whatwhatwhat\"을(를) 리턴해야 합니다")
    void repeatString() {
        assertThat(test.repeatString("what", 3)).isEqualTo("whatwhatwhat");
    }

    @Test
    @DisplayName("차례대로 \"what\", 0을(를) 입력받은 경우, 빈 문자열을(를) 리턴해야 합니다")
    void repeatString2() {
        assertThat(test.repeatString("what", 0)).isEqualTo("");
    }

    @Test
    @DisplayName("차례대로 \"\", 10000을(를) 입력받은 경우, 빈 문자열을(를) 리턴해야 합니다")
    void repeatString3() {
        assertThat(test.repeatString("", 10000)).isEqualTo("");
    }
}