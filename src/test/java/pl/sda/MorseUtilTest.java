package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class MorseUtilTest {

    @Test
    public void testMorseEncoding() {
        //given
        String textToEncode = "Litwo ojczyzno moja";
        String expectedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";

        //when
        String result = MorseUtil.encodeMorse(textToEncode);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMorseDecoding() {
        //given
        String textToDecode = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        String expectedResult = "Litwo ojczyzno moja";

        //when
        String result = MorseUtil.decodeMorse(textToDecode);

        //then
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }
}