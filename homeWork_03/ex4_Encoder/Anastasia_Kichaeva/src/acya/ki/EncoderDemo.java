package acya.ki;

public class EncoderDemo {
    public static void main(String[] args) {
        short Short = 132;
        char Char = '&';
        Encoder.encode(Short);
        Encoder.decode(Char);

    }
}
