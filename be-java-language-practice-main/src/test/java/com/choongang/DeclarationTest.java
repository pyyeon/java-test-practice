package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeclarationTest {
    @Test
    @DisplayName("char 키워드를 사용하여 course 변수를 선언하세요")
    public void testCourseVariableExists() {
        // 클래스가 char 타입의 'course' 변수를 가지고 있는지 테스트
        try {
            // Solution 클래스의 Field 객체를 가져옵니다.
            Field field = Declaration.class.getDeclaredField("course");

            // 접근 제한을 무시하고 필드에 접근할 수 있게 설정
            field.setAccessible(true);

            // 필드의 타입이 char인지 확인
            assertEquals(char.class, field.getType(), "course 변수는 char 타입이어야 합니다.");

        } catch (NoSuchFieldException e) {
            // 'course' 필드를 찾지 못한 경우 테스트 실패 처리
            fail("Declaration 클래스에는 'course' 변수가 선언되어 있어야 합니다.");
        }
    }
}