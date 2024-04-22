//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class M_ReplaceAllTest {
//
//    M_ReplaceAll test = new M_ReplaceAll();
//    @Test
//    @DisplayName("차례대로 \"hello\", 'l', 'k'을(를) 입력받은 경우, \"hekko\"을(를) 리턴해야 합니다")
//    void replaceAll() {
//        assertThat(test.replaceAll("hello", 'l', 'k')).isEqualTo("hekko");
//    }
//
//    @Test
//    @DisplayName("차례대로 \"javaworld\", 'a', 'o'을(를) 입력받은 경우, \"jovoworld\"을(를) 리턴해야 합니다")
//    void replaceAll2() {
//        assertThat(test.replaceAll("javaworld", 'a', 'o')).isEqualTo("jovoworld");
//    }
//
//    @Test
//    @DisplayName("차례대로 \"nothing\", 'k', 'a'을(를) 입력받은 경우, \"nothing\"을(를) 리턴해야 합니다")
//    void replaceAll3() {
//        assertThat(test.replaceAll("nothing", 'k', 'a')).isEqualTo("nothing");
//    }
//}