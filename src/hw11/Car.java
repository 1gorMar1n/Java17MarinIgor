package hw11;

public class Car extends Transport{
    public Car() {
        super(95, "v6", 4, 150432);
    }

    @Override
    public void printInfo(int oil, int wheels, String engine) {
    }
    @Override
    public void go(int speed, int time) {
        setSpeed(12);
    }
}



