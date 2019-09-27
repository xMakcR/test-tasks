package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class task5 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите лимит (не больше 100): ");
        String input = bufferedReader.readLine();
        int limit = Integer.parseInt(input);

        if (limit > 100 || limit < 0) {
            System.out.println("Вы ввели некорректное число");
        } else {
            System.out.println(allPalindromic(limit));
        }

    }

    public static Set<Integer> allPalindromic(int limit) {

        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i <= 9 && i <= limit; i++)
            result.add(i);

        boolean cont = true;
        for (int i = 1; cont; i++) {
            StringBuffer rev = new StringBuffer("" + i).reverse();
            cont = false;
            for (String d : ",0,1,2,3,4,5,6,7,8,9".split(",")) {
                int n = Integer.parseInt("" + i + d + rev);
                if (n <= limit) {
                    cont = true;
                    result.add(n);
                }
            }
        }

        return result;
    }
}
