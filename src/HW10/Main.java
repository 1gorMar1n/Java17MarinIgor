package HW10;

public class Main {
    public static void main(String[] args) {
        Dog bobik =new Dog("bobik");
        System.out.println(bobik.getPaw());
        Pet hamster = new Hamster("");
        Pet[] pets = {bobik, hamster};
         for(Pet pet : pets){
             if(pet instanceof Pet) {
//                 pet.say();
             }
             if(pet instanceof Hamster ham) {
                   ham.sleep();
             }
         }
    }
}
