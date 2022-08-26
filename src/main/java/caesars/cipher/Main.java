package caesars.cipher;

public class Main {
    public static void main(String[] args) {
        String message = "This is Tony Sabal and I am a SDET";
        int offset = 7;

        CaesarCipher caesarCipher = new CaesarCipher();

        String cipheredMessage = caesarCipher.cipher(message, offset);

        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered Message: " + cipheredMessage);
    }
}
