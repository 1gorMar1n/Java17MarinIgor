package lesson18;

public class NotFuelException extends RuntimeException{
     public NotFuelException(int fuelLevel){
         super("No fuel: " + fuelLevel);
     }
}
