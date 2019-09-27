package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main (String[] Args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;

        try {
            System.out.println("Введите предложение: ");
            input = bufferedReader.readLine();

            System.out.println("Количество слов: " + wordCounter(input));
            wordsSorter(input);
            System.out.println("Вывод заглавных букв: " + upWords(input));
        } catch (IOException e)
        {
            System.out.println("Что-то пошло не так");
        }
    }

    public static int wordCounter(String s) {
        int wordCount = 0;

        if(s.length() != 0) {
            wordCount++;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    wordCount++;
                }
            }
        }

        return wordCount;
    }

    public static String upWords(String in)
    {
        char[] words = in.toCharArray();

        if(Character.isLetter(words[0])) {
            words[0] = Character.toUpperCase(words[0]);
        }

        String result = "" + words[0];

        for(int i = 1; i < words.length; i++)
        {
            if(Character.isLetter(words[i]) && !Character.isLetter(words[i-1])) {
                words[i] = Character.toUpperCase(words[i]);
            }

            result += words[i];
        }

        return result;
    }

    public static void wordsSorter (String _input) {
        List<String> wordsList = new ArrayList();
        String[] words = _input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
        }

        Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Вывод в алфавитном порядке: ");

        for (int i = 0; i < wordsList.size(); i++) {
            System.out.print(" " + wordsList.get(i) + " ");
        }
        System.out.println("");
    }
}
