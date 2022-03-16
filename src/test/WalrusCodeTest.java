package test;
import main.Walrus_code;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalrusCodeTest {

    @Test
    public void CheckNumber_numberInputINT_True(){

        //given
        String numberInput = "3";

        //when
        boolean result = Walrus_code.CheckNumber(numberInput);

        //then
        Assertions.assertEquals(true,result);
    }

    @Test
    public void CheckNumber_numberInputNotINT_False(){

        //given
        String numberInput = "3A!";

        //when
        boolean result = Walrus_code.CheckNumber(numberInput);

        //then
        Assertions.assertEquals(false,result);
    }

    @Test
    public void CheckNumber_numberInputNotINT_False1(){

        //given
        String numberInput = "A";

        //when
        boolean result = Walrus_code.CheckNumber(numberInput);

        //then
        Assertions.assertEquals(false,result);
    }

    @Test
    public void numToMorse_numberInputINT_String(){

        //given
        String numberInput = "3";

        //when
        String result = Walrus_code.numToMorse(numberInput);

        //then
        Assertions.assertEquals("...--",result);
    }


}
