package javabasic.example05;

public class example05_03 {
    public static void main(String[] args) {
        // Person 객체 생성 및 정보 출력
        Person person1 = new Person("yeeyeon", 30);
        person1.introduce();

        Person person2 = new Person("coding", 21);
        person2.introduce();

        // Book 객체 생성 및 정보 출력
        Book book = new Book("자바의 기초", "박이연", 500);
        book.printInfo();
    }
}


