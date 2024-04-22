//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class S_MakePermutationsTest {
//
//    S_MakePermutations test = new S_MakePermutations();
//    @Test
//    @DisplayName("빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다")
//    void makePermutations() {
//        assertThat(test.makePermutations("")).isEqualTo("");
//    }
//
//    @Test
//    @DisplayName("'+'을(를) 입력받은 경우, '++'을(를) 리턴해야 합니다")
//    void makePermutations2() {
//        assertThat(test.makePermutations("+")).isEqualTo("++");
//    }
//
//    @Test
//    @DisplayName("'87'을(를) 입력받은 경우, '88,87,78,77'을(를) 리턴해야 합니다")
//    void makePermutations3() {
//        assertThat(test.makePermutations("87")).isEqualTo("88,87,78,77");
//    }
//
//    @Test
//    @DisplayName("'cat'을(를) 입력받은 경우, 'cc,ca,ct,ac,aa,at,tc,ta,tt'을(를) 리턴해야 합니다")
//    void makePermutations4() {
//        assertThat(test.makePermutations("cat")).isEqualTo("cc,ca,ct,ac,aa,at,tc,ta,tt");
//    }
//}