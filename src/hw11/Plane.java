package hw11;

public abstract class Plane extends Transport{
    public Plane(int oil, String engine, int wheels, int distance) {
        super(oil, engine, wheels, distance);
    }
    @Override
    public void printInfo(int oil, int wheels, String engine) {
    }
    @Override
    public void go(int speed, int time) {
    }
}
