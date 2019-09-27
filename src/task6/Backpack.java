package task6;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<Item> bestItemCombination = null;
    private int maxWeight;
    private int maxPrice;
    private int sWeight;

    Backpack(int _maxWeight) {
        maxWeight = _maxWeight;
    }

    private int CalculateWeight(ArrayList<Item> items) {
        int sumWeight = 0;

        for (int i = 0; i < items.size(); i++) {
            sumWeight += items.get(i).getWeight();
        }

        return sumWeight;
    }

    private int CalculatePrice(ArrayList<Item> items) {
        int sumPrice = 0;

        for (int i = 0; i < items.size(); i++) {
            sumPrice += items.get(i).getPrice();
        }

        return sumPrice;
    }

    private void CheckCombination(ArrayList<Item> items) {
        if (bestItemCombination == null) {
            if (CalculateWeight(items) <= maxWeight) {
                bestItemCombination = items;
                maxPrice = CalculatePrice(items);
            }
        }
        else {
            if (CalculateWeight(items) <= maxWeight && CalculatePrice(items) > maxPrice)
            {
                bestItemCombination = items;
                maxPrice = CalculatePrice(items);
                sWeight = CalculateWeight(items);
            }
        }
    }

    public void MakeAllCombinations(ArrayList<Item> items) {
        if (items.size() > 0) {
            CheckCombination(items);
        }

        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newCombination = new ArrayList<Item>(items);
            newCombination.remove(i);

            MakeAllCombinations(newCombination);
        }
    }

    public void showBackpack() {
        for (int i = 0; i < bestItemCombination.size(); i++) {
            bestItemCombination.get(i).showItem();
            System.out.println("Суммарный вес: " + sWeight);
            System.out.println("Суммарная цена: " + maxPrice);
        }
    }
}
