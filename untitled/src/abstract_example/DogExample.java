package abstract_example;

public class DogExample {
    public static void main(String[] args) throws Exception {
        //throws Exception은 메서드나 생성자가 해당 메서드나 생성자 내에서 발생할 수 있는 예외를 호출한 곳으로 던진다
        Animal dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

    }
}
