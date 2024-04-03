package lesson12_2;

public class Guitar implements Instrument{
    int Strings;

    @Override
    public void play() {
        System.out.println("Guitar sounds");
    }
}
