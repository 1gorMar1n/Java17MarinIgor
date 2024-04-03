package lesson12;

public class Book implements Printable {
 public static String[] printBooks(String[] inputarray){
  String[] outputarray;
  String template = "Book";
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
  return outputarray;
 }

}
