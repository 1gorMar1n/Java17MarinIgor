package lesson18;
/*Создать класс Car. Создать аттрибуты name, color и fuelLevel. Первый метод drive будет иметь тип данных void и
параметр int. Если данный параметр равен нулю, то пусть выбрасывается исключение NotFuelException. Второй метод
safetyBelt пусть принимает String и если в строке будет значение "Not Belt", то пусть выбрасывается NotBeltException.
Если нет, то пусть выводит сообщение "Car is running"
 */
public class Car {
        String name;
        String color;
        int fuelLevel;
        String beltStatus;
        public Car(String name, String color, String beltStatus, int fuelLevel){
            this.name = name;
            this.color = color;
            this.fuelLevel = fuelLevel;
            this.beltStatus = beltStatus;
        }
        public void drive ( int fuelLevel){
if(fuelLevel == 0){
    throw new NotFuelException(0);
}
    }
    public void safetyBelt(String beltStatus) throws NotBeltException {
if(beltStatus == ("not belt")){
    throw new NotBeltException("not belt");
}else {
    System.out.println("Car is running");
}
    }
}
