package lesson18;

public class ManageCar {
    public static void main(String[] args) {
        Car car = new Car("BMW","black", "belt", 1);
        try {
            car.drive(0
            );
        } catch (NotFuelException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            car.safetyBelt("not belt");
        }catch (NotBeltException e){
            System.out.println("Exception:" + e.getMessage());
        }
    }

}
