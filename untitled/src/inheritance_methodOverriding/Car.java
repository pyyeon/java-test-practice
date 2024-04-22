package inheritance_methodOverriding;

public class Car extends  Vehicle{
    @Override
    void run() {
        System.out.println("Car is running");
    }
}
