package main;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Walrus_code {
    public static void main(String[] args) throws IOException {

        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] morse = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Wpisz cyfre...");
            String numberInput = reader.readLine();
            if(CheckNumber(numberInput)){
                System.out.println((numToMorse(numberInput, numbers, morse)));
            }else{
                throw new IllegalArgumentException("Nie podano prawidłowej cyfry");
            }
        }

    }

    public static boolean CheckNumber(String numberInput) {
        if (Pattern.matches("^[0-9]",numberInput)==true){
            return true;
        }return false;
    }

    public static StringBuilder numToMorse(String numberInput, char[] numbers, String[] morse){
        StringBuilder answer = new StringBuilder();
        numberInput = numberInput.toLowerCase();
        char[] morsec = numberInput.toCharArray();
        for (int i = 0; i < morsec.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == morsec[i]) {
                    answer.append(morse[j]);
                }
            }
        }
        System.out.println(numberInput + " na kod morse'a to:");
        return answer;
    }


}
