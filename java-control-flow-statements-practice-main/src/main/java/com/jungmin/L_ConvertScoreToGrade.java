package com.jungmin;
public class L_ConvertScoreToGrade {
    public char convertScoreToGrade(int score) {

        if (score > 100 || score < 0) {
            return 'X';
        }
       else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score > 60) {
            return 'D';
        } else {
            return 'F';
        }

       /*
       char str;
       if
       str = '';

        */

    }
}