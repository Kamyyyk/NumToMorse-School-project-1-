package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Walrus_code {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Wpisz cyfre...");
            String numberInput = reader.readLine();
            if(CheckNumber(numberInput)){
                System.out.println((numToMorse(numberInput)));
            }else{
                System.out.println("Podaj cyfrę od 0 do 9");
            }
        }
    }

    public static boolean CheckNumber(String numberInput) {
        if (Pattern.matches("^[0-9]+$",numberInput)==true){
            return true;
        }return false;
    }

    public static String numToMorse(String numberInput){
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] morse = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        StringBuilder answer = new StringBuilder();
        char[] morsec = numberInput.toCharArray();
        for (int i = 0; i < morsec.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == morsec[i]) {
                    answer.append(morse[j]);
                }
            }
        }
        System.out.println(numberInput + " na kod morse'a to:");
        return answer.toString();
    }
}
