//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//class K_CountCharacterTest {
//
//    K_CountCharacter test = new K_CountCharacter();
//
//    @Test
//    @DisplayName("차례대로 \"say what!?\",'a'을(를) 입력받은 경우, 2을(를) 리턴해야 합니다")
//    void countCharacter() {
//        assertThat(test.countCharacter("say what!?",'a')).isEqualTo(2);
//    }
//
//    @Test
//    @DisplayName("차례대로 \"say what!?\",' '을(를) 입력받은 경우, 1을(를) 리턴해야 합니다")
//    void countCharacter2() {
//        assertThat(test.countCharacter("say what!?",' ')).isEqualTo(1);
//    }
//
//    @Test
//    @DisplayName("차례대로 \"say what!?\",'x'을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void countCharacter3() {
//        assertThat(test.countCharacter("say what!?",'x')).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("차례대로 \"\",'a'을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
//    void countCharacter4() {
//        assertThat(test.countCharacter("", 'a')).isEqualTo(0);
//    }
//}