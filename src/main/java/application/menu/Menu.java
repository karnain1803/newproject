package application.menu;

import java.util.ArrayList;
import java.util.List;


public abstract class Menu {
    protected List<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public abstract void printAllItems();
}
