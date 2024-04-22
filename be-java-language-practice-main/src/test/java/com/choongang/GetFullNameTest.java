package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetFullNameTest {

    GetFullName test = new GetFullName();
    @Test
    @DisplayName("차례대로 Java, Spring을(를) 입력받은 경우, \"Java Spring\"을(를) 리턴해야 합니다")
    void getFullName() {
        assertThat(test.getFullName("Java", "Spring").equals("Java Spring")).isTrue();
    }

    @Test
    @DisplayName("차례대로 Rebecca, Solnit을(를) 입력받은 경우, \"Rebecca Solnit\"을(를) 리턴해야 합니다")
    void getFullName2() {
        assertThat(test.getFullName("Rebecca", "Solnit").equals("Rebecca Solnit")).isTrue();
    }
}