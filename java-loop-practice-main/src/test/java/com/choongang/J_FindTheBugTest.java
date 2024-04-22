//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class J_FindTheBugTest {
//
//    J_FindTheBug test = new J_FindTheBug();
//
//    @Test
//    @DisplayName("\"cup#\"을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
//    void findBug() {
//        assertThat(test.findTheBug("cup#")).isEqualTo(3);
//    }
//
//    @Test
//    @DisplayName("\"#lizard\"을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void findBug2() {
//        assertThat(test.findTheBug("#lizard")).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("\"spider\"을(를) 입력받은 경우, -1을(를) 리턴해야 합니다")
//    void findBug3() {
//        assertThat(test.findTheBug("spider")).isEqualTo(-1);
//    }
//
//    @Test
//    @DisplayName("빈 문자열을(를) 입력받은 경우, -1을(를) 리턴해야 합니다")
//    void findBug4() {
//        assertThat(test.findTheBug("")).isEqualTo(-1);
//    }
//
//}