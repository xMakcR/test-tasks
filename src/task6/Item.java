package task6;

public class Item {
    private String name;
    private int weight;
    private int price;

    Item(String _name, int _weight, int _price) {
        this.name = _name;
        this.weight = _weight;
        this.price = _price;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPrice() {
        return this.price;
    }

    public void showItem() {
        System.out.println("Название: " + name);
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);
    }
}
