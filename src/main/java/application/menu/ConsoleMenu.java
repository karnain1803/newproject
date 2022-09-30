package application.menu;

public class ConsoleMenu extends Menu{

    @Override
    public void printAllItems() {
        for (MenuItem menuItem: menuItems ) {
            System.out.println(menuItem.getValue());
        }
    }
}
