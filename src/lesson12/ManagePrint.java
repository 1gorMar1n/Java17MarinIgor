package lesson12;

public class ManagePrint {
    public static void main(String[] inputarray) {
        Printable printBookAndMagazine = new Printable() {
        };
        printBookAndMagazine.print();
        Book Book1 = new Book();
        Magazine Magazine1 = new Magazine();
        String[] array = new String[] {"Book1", "Magazine1", "Book1", "Book1", "Magazine1"};
        String[] outputarray;
        String template = "Book1";
        byte index = 0;
        for(String input:inputarray){
            if(input.contentEquals(template)){
                index++;
            }
        }
        outputarray = new String[index];
        index = 0;
        for(String input:inputarray){
            if(input.contentEquals(template)){
                outputarray[index] = input;
            }
        }
    }
}
