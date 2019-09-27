package task1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task1 {
    public static void main (String[] Args) throws IOException {
        System.out.println("Введите целое число: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        int x = 0;

        try{
            input = bufferedReader.readLine();

            x = Integer.parseInt(input);
            ParityCheck(x);
            SimpleNumberCheck(x);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Число не целое!");
        }
    }

    private static void ParityCheck(int n){
        if(n % 2 == 0) {
            System.out.println("Число " + n + " четное");
        } else {
            System.out.println("Число " + n + " нечетное");
        }
    }

    private static void SimpleNumberCheck(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                System.out.println("Число " + n + " составное");
                return;
            }
        }
        System.out.println("Число " + n + " простое");
    }
}
