package inheritance_Person;

public class HelloJava {
    public static void main(String[] args) {
//Person 객체 생성
        Person p = new Person();
        p.name = "김코딩";
        p.age = 24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);

        //Progammer 객체 생성
Programmer pg = new Programmer();
pg.name = "박헤커";
pg.age = 26;
pg.learn();;//Person상속 받아 사용가능
pg.coding();//Programmer 개별기능
        System.out.println(pg.name);
    }

}
