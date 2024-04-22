
public class Main {
    public static void main(String[] args) {
        Outer : for (int i = 3; i < 10; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.println("i " + i + " j "+ j);
                if (i == 5) {
                    break Outer;
                }
            }
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
