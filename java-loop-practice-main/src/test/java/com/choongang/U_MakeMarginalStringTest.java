//package com.choongang;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class U_MakeMarginalStringTest {
//
//    U_MakeMarginalString test = new U_MakeMarginalString();
//
//    @Test
//    @DisplayName("빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다")
//    void makeMarginalString() {
//        assertThat(test.makeMarginalString("")).isEqualTo("");
//    }
//
//    @Test
//    @DisplayName("\"cat\"을(를) 입력받은 경우, \"ccacat\"을(를) 리턴해야 합니다")
//    void makeMarginalString2() {
//        assertThat(test.makeMarginalString("cat")).isEqualTo("ccacat");
//    }
//
//    @Test
//    @DisplayName("\"tower\"을(를) 입력받은 경우, \"ttotowtowetower\"을(를) 리턴해야 합니다")
//    void makeMarginalString3() {
//        assertThat(test.makeMarginalString("tower")).isEqualTo("ttotowtowetower");
//    }
//}