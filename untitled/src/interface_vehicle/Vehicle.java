package interface_vehicle;

public interface Vehicle {

    void start();
    void stop();
    void accelerate(int speed);
    void decelerate(int speed);
    void turn(String direction);


}
