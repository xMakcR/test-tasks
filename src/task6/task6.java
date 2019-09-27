package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task6 {



    public static void main(String[] Args) throws IOException {
        ArrayList<Item> items = new ArrayList<Item>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        int itemsNeed = 0;
        String creatingItemName = null;
        int creatingItemWeight = 0;
        int creatingItemPrice = 0;

        System.out.println("Введите желаемое кол-во предметов: ");
        input = bufferedReader.readLine();
        itemsNeed = Integer.parseInt(input);

        for (int i = 0; i < itemsNeed; i++) {
            System.out.println("Введите название предмета: ");
            creatingItemName = bufferedReader.readLine();

            System.out.println("Введите вес предмета: ");
            input = bufferedReader.readLine();
            creatingItemWeight = Integer.parseInt(input);

            System.out.println("Введите стоимость предмета: ");
            input = bufferedReader.readLine();
            creatingItemPrice = Integer.parseInt(input);

            Item e = new Item(creatingItemName, creatingItemWeight, creatingItemPrice);
            items.add(e);

        }

        System.out.println("Введите емкость рюкзака: ");
        input = bufferedReader.readLine();

        Backpack backpack = new Backpack(Integer.parseInt(input));

        backpack.MakeAllCombinations(items);
        backpack.showBackpack();
    }




}
