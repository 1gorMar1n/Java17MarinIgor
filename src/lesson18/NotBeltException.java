package lesson18;

public class NotBeltException extends Exception{
   public NotBeltException(String beltStatus){
      super("No belt: " + beltStatus);
   }
}
