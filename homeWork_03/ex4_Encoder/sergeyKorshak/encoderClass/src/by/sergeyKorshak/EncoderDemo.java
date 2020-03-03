package by.sergeyKorshak;

public class EncoderDemo {
    public static void main(String[] args) {

        short myShort = 65;
        char myChar = 'X';
        Encoder.encode(myShort);
        Encoder.decode(myChar);
    }
}
