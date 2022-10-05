//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			Menu.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
//////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

	Map<Integer, ItemMenu> menu;
	
	public Menu(File f) {
		menu = new HashMap<>();
		try {
			BurgersMenu burgerMenu = new BurgersMenu();
			DrinksMenu drinkMenu = new DrinksMenu();
			SidesMenu sideMenu = new SidesMenu();
            Scanner s = new Scanner(f);
            while (s.hasNextLine()){
                String item = s.nextLine();
                String type = item.substring(item.indexOf("Type:")+5 , item.indexOf(" Name:"));
                String name = item.substring(item.indexOf("Name:")+ 5, item.indexOf(" Price"));
                double price = Double.parseDouble(item.substring(item.indexOf("Price") + 7));
				MenuItem menuItem = new MenuItem(type, name, price);
				if (type.equals("Burger")) burgerMenu.addBurger(menuItem);
				else if (type.equals("Drinks")) drinkMenu.addDrink(menuItem);
				else if (type.equals("Sides")) sideMenu.addSide(menuItem);
			}
			menu.put(1, burgerMenu);
			menu.put(2, drinkMenu);
			menu.put(3, sideMenu);
			s.close();
        } catch (Exception e) {
            System.out.println("oops");
        }
	}

	public void printCategories() {
		System.out.println("\nCategories:");
		for (Integer i : menu.keySet()) {
			System.out.println(i+". "+ menu.get(i).getType());
		}
	}

}
	
