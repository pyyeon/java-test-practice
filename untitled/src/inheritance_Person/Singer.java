package inheritance_Person;

public class Singer extends Person{
    String bandName;
    void singing(){
        System.out.println("노래를 합니다.");
    }
    void playGuitar(){
        System.out.println("기타를 칩니다.");
    }
}
