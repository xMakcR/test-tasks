package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class task4 {
    public static void main(String[] Args) throws IOException {
        int counter = 0;

        System.out.println("Введите предложение: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String[] words = input.split("\\s+");

        System.out.println("Введите слово, которое нужно найти: ");
        String findWord = bufferedReader.readLine();

        for (int i = 0; i < words.length; i++) {
            if (findWord.equals(words[i])) {
                counter++;
            }
        }

        System.out.println("Слово " + findWord + " встречается " + counter + " раз");
    }
}