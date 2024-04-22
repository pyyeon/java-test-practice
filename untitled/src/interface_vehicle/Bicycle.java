package interface_vehicle;

public class Bicycle implements Vehicle {
    private  int speed = 0;
    @Override
    public void start() {
        System.out.println("자전거 위에 올라타고 핸들을 세게 잡아봅니다.");
    }

    @Override
    public void stop() {
        System.out.println("자전거에서 내려옵니다. 바이바이 자전거");
    }

    @Override
    public void accelerate(int speed) {
        this.speed += speed;
        System.out.printf("자전거의 현재 속도는 %d입니다.%n", this.speed);
    }

    public void decelerate(int speed) {
        this.speed -= speed;
        System.out.printf("자전거의 현재 속도는 %d입니다.%n", this.speed);
    }

    @Override
    public void turn(String direction) {
        System.out.printf("자전거의 현재 방향을 %s로 변경합니다.%n", direction);

    }
}
