package by.serg;

public class Encoder {

    // Methods
    public void encode(short code) {
        System.out.println(code + " => " + (char) code);
    }

    public void decode(char symbol) {
        System.out.println(symbol + " => " + (int) symbol);
    }
}
