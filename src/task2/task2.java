package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main (String[] Args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        int x1, x2 = 0;

        try{
            System.out.println("Введите первое целое число: ");

            input = bufferedReader.readLine();
            x1 = Integer.parseInt(input);

            System.out.println("Введите второе целое число: ");

            input = bufferedReader.readLine();
            x2 = Integer.parseInt(input);

            System.out.println("НОД: " + NOD(x1, x2));
            System.out.println("НОК: " + NOK(x1, x2));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Число не целое!");
        }


    }

    private static int NOD(int a, int b) {
        return b == 0 ? a : NOD(b,a % b);
    }

    private static int NOK(int a, int b) {
        return a / NOD(a, b) * b;
    }
}
