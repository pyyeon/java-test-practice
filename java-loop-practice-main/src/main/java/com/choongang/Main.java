package com.choongang;

public class Main {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
/*
i 3 j 5
i 3 j 4
i 3 j 3
i 3 j 2
i 3 j 1
i 4 j 5
i 4 j 4
i 4 j 3
i 4 j 2
i 4 j 1
i 5 j 5
*/
