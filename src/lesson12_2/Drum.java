package lesson12_2;

public class Drum implements Instrument{
    String size;


    @Override
    public void play() {
        System.out.println("Drum sounds");
    }
}
