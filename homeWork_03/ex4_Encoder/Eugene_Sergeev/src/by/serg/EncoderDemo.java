package by.serg;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.encode((short) 3522);
        encoder.encode((short) 10000);
        encoder.decode('>');
        encoder.decode('`');
    }
}
