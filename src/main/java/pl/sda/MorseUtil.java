package pl.sda;

public class MorseUtil {
    public static String encodeMorse(String textToEncode) {
        MorseEncoder encoder = new MorseEncoder();
        return encoder.encode(textToEncode);
    }

    public static String decodeMorse(String textToDecode) {
        MorseDecoder decoder = new MorseDecoder();
        return decoder.decode(textToDecode);
    }
}
