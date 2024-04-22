package com.choongang;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompareOnlyAlphabetTest {

    CompareOnlyAlphabet test = new CompareOnlyAlphabet();
    @Test
    @DisplayName("차례대로 \"SeCrEt\", \"sEcReT\"을(를) 입력받은 경우, true를 리턴해야 합니다")
    void compareOnlyAlphabet() {
        assertThat(test.compareOnlyAlphabet("SeCrEt", "sEcReT")).isTrue();
    }

    @Test
    @DisplayName("차례대로 \"SeCrEt\", \"sEKReT\"을(를) 입력받은 경우, false를 리턴해야 합니다")
    void compareOnlyAlphabet_2() {
        assertThat(test.compareOnlyAlphabet("SeCrEt", "sEKReT")).isFalse();
    }

    @Test
    @DisplayName("차례대로 \"SeCrEt\", \"sEcReTs\"을(를) 입력받은 경우, false를 리턴해야 합니다")
    void compareOnlyAlphabet_3() {
        assertThat(test.compareOnlyAlphabet("SeCrEt", "sEcReTs")).isFalse();
    }

    @Test
    @DisplayName("차례대로 \"hello\", \"world\"을(를) 입력받은 경우, false를 리턴해야 합니다")
    void compareOnlyAlphabet_4() {
        assertThat(test.compareOnlyAlphabet("hello", "world")).isFalse();
    }
}