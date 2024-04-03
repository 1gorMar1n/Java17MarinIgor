package HW10;

public class Hamster extends Pet{
    public Hamster(String name) {
        super(name);
        System.out.println("I am a hamster and my name is: " + this.getName());
    }
    public void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
