package javabasic.example05;

public class example05_02 {
    public static void main(String[] args) {
        // Book 객체 생성
        Book book = new Book("Java Programming", "John Doe", 20000);
        // 필드 값을 출력
        book.printInfo();

        // Person 객체 생성
        Person person = new Person("yeeyeon", 30);
        // 필드 값을 출력
        person.introduce();
    }
}