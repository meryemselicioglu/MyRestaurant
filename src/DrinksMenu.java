//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			DrinksMenu.java
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//////////////////////////////////////////////////////////////////////


import java.util.HashMap;

public class DrinksMenu extends ItemMenu{
    private int i = 1;
    public DrinksMenu() {
        this.items = new HashMap<>();
        type = "Drinks";
    }

    public void addDrink(MenuItem item) {
        items.put(i, item);
        i++;
    }
}
