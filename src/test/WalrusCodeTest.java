package test;
import main.Walrus_code;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalrusCodeTest {

    @Test
    public void CheckNumber_numberInputINT_True(){

        //given
        String numberInput = "3";
        Walrus_code Morse = new Walrus_code();

        //when
        boolean result = Morse.CheckNumber(numberInput);

        //then
        Assertions.assertEquals(result,true);
    }

    @Test
    public void main_numberInput_throwsIllegalArgumentException(){

        //given
        String numberInput = "A";
        Walrus_code Morse = new Walrus_code();

        //when





    }

}
