package com.jungmin;
public class M_ConvertScoreToGradeWithPlusAndMinus {
    public String convertScoreToGradeWithPlusAndMinus(int score) {
        String grade;
        //A+예외적으로 처리
        if (score > 100 || score < 0) {
            return "INVALID SCORE";
        }
        if (score == 100) {
            return "A+";//A+예외적으로 처리
            //grade="A+"; 이면 90에서 안 걸러질 수 있음
        }
        if (score >= 90) {
            grade="A";
        } else if (score >= 80) {
            grade= "B";
        } else if (score >= 70) {
            grade= "C";
        } else if (score >= 60) {
            grade= "D";
        } else {
            grade= "F";
        }
       // 세부등급을 더하는 로직은 하단에 추가 구현
        //결국 A,B,C,D만 붙어야 하므로, 조건은 score>=60&&score<=99
        if (!grade.equals("F")) {
            int extra = score % 10;
            if (extra <= 2) {
                return grade + "-";
            } else if (extra >= 8) {
                return grade + "+";
            }
        }


        return grade;
    }
}
