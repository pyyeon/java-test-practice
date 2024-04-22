package inheritance_Human;

public class Student extends Human{
    Student(){
        super();//Human 클래스 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}
