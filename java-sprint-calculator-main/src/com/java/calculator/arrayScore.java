package com.java.calculator;

public class arrayScore {
    public static void main(String[] args) {
        int[] scores = { 100, 90, 85, 95, 100 };
        int sum = 0;

        for (int score: scores) {
            sum += score;
        }
        System.out.println(sum); // 470
    }
}
