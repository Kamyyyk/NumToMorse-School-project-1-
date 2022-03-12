import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] morse = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberInput = reader.readLine();


            try {
                System.out.println((numtomorse(numberInput, numbers, morse)));
            } catch (Exception e) {
                System.out.println("Blad" + e);
            }
        }


    public static StringBuilder numtomorse(String numberInput, char[] numbers, String[] morse){
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