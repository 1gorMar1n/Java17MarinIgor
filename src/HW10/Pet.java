package HW10;

public class Pet extends Animal {
    private String name;
    final private int tail = 1;
    private int paw = 4;
    public Pet(){
        super(2);
        System.out.println("I am Pet");
    }
    public Pet(int eyes){
        super(eyes);
    }
    public Pet(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getPaw() {
        return paw;
    }

    public void Run(){
        System.out.println("Pet run");
    }
    public void Jump(){
        System.out.println("Pet jump");
    }
//    public abstract void say();
}
