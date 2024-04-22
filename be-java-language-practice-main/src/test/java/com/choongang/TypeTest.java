package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TypeTest {

    Type test = new Type();

    @Test
    @DisplayName("코딩이가 정확한 건전지의 갯수를 확인하는 메시지를 반환해야 합니다.")
    void type() {
        assertThat(test.type().equals("코딩아, 공구함에 있는 건전지말야. A가 3개 들어있는게 맞니?")).isTrue();
    }
}