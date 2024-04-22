public enum Days {
    SUNDAY("일요일", 1),

    MONDAY("월요일", 2),
 TUESDAY("화요일", 3),
  WEDNESDAY("수요일", 4),
   THURSDAY("목요일", 5),
    FRIDAY("금요일", 6),
  SATURDAY("토요일", 7);

    private String day;
    private int dayNum;

    Days(String day , int dayNum){
        this.day = day;
        this.dayNum = dayNum;
    }
    public String getDay(){return day;}
    public  int getDayNum(){return dayNum;}

}
