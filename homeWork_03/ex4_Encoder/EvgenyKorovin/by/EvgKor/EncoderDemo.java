package by.EvgKor;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder=new Encoder();
        encoder.encode((short) 36);
        encoder.encode((short) 123);
        encoder.decode('$');
        encoder.decode('{');

    }
}
