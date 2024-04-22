//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class T_HasRepeatedCharacterTest {
//
//    T_HasRepeatedCharacter test = new T_HasRepeatedCharacter();
//
//    @Test
//    @DisplayName("빈 문자열을 입력받은 경우, false를 리턴해야 합니다")
//    void hasRepeatedCharacter() {
//        assertThat(test.hasRepeatedCharacter("")).isFalse();
//    }
//
//    @Test
//    @DisplayName("\"abcdefghijklmnopqrstuvwxyz\"을(를) 입력받은 경우, false를 리턴해야 합니다")
//    void hasRepeatedCharacter2() {
//        assertThat(test.hasRepeatedCharacter("abcdefghijklmnopqrstuvwxyz")).isFalse();
//    }
//
//    @Test
//    @DisplayName("\"abcdefghijklmnopqrstuvwxyzz\"을(를) 입력받은 경우, true를 리턴해야 합니다")
//    void hasRepeatedCharacter3() {
//        assertThat(test.hasRepeatedCharacter("abcdefghijklmnopqrstuvwxyzz")).isTrue();
//    }
//}