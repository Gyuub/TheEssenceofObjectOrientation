package coffee;


import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        this.menuItems.add(new MenuItem("아메리카노", 1000));
        this.menuItems.add(new MenuItem("카페라떼", 1500));
        this.menuItems.add(new MenuItem("녹차", 2000));
        this.menuItems.add(new MenuItem("홍차", 2500));
    }

    public MenuItem choose(String name) {
        return menuItems.stream()
                .filter(menuItem -> menuItem.getMenuName().equals(name))
                .findFirst().orElse(null);
    }
}
