package intrface_methodOverriding;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();
    }
}
