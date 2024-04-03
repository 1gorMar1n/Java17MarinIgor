package lesson12;

public interface Printable {
 default void print(){
     System.out.println("books and magazines");
 }
//Printable[] printable = new Printable[]{"Magazine", "Book", "Magazine", "Book", "Book", "Magazine"};
}