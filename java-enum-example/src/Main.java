public class Main {
    private static final String
    public static void main(String[] args) {
        Days currentDay = Days.SATURDAY;
        System.out.println(currentDay);

        switch (currentDay){
            case FRIDAY :
                System.out.println(currentDay.getDay());
                System.out.println(currentDay.getDayNum());
        }
    }
}
