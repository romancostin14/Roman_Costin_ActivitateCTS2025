package Composite.v1_composite.program;

import Composite.v1_composite.clase.Menu;
import Composite.v1_composite.clase.MenuComponent;
import Composite.v1_composite.clase.MenuItem;

public class Program {
    public static void main(String[] args) {
        MenuComponent fileMenu = new Menu("File");
        MenuComponent newFile = new MenuItem("New");
        MenuComponent openFile = new MenuItem("Open");
        ((Menu) fileMenu).add(newFile);
        ((Menu) fileMenu).add(openFile);

        MenuComponent editMenu = new Menu("Edit");
        MenuComponent copy = new MenuItem("Copy");
        MenuComponent paste = new MenuItem("Paste");
        ((Menu) editMenu).add(copy);
        ((Menu) editMenu).add(paste);

        MenuComponent mainMenu = new Menu("Main");
        ((Menu) mainMenu).add(fileMenu);
        ((Menu) mainMenu).add(editMenu);

        mainMenu.display();
    }
}