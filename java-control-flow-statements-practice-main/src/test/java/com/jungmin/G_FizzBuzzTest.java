package com.jungmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class G_FizzBuzzTest {

    G_FizzBuzz test = new G_FizzBuzz();

    @Test
    @DisplayName("21을(를) 입력받은 경우, \"Fizz\"`을(를) 리턴해야 합니다")
    void fizzBuzz() {
        assertThat(test.fizzBuzz(21)).isEqualTo("Fizz");
    }

    @Test
    @DisplayName("10을(를) 입력받은 경우, \"Buzz\"을(를) 리턴해야 합니다")
    void fizzBuzz2() {
        assertThat(test.fizzBuzz(10)).isEqualTo("Buzz");
    }

    @Test
    @DisplayName("8을(를) 입력받은 경우, \"No FizzBuzz\"을(를) 리턴해야 합니다")
    void fizzBuzz3() {
        assertThat(test.fizzBuzz(8)).isEqualTo("No FizzBuzz");
    }

    @Test
    @DisplayName("30을(를) 입력받은 경우, \"FizzBuzz\"을(를) 리턴해야 합니다")
    void fizzBuzz4() {
        assertThat(test.fizzBuzz(30)).isEqualTo("FizzBuzz");
    }
}
