package coffee;

public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getMenuName();
        this.price = menuItem.cost();
    }
}
