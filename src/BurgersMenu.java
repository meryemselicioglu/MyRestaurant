//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			BurgersMenu.java

//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//////////////////////////////////////////////////////////////////////


import java.util.HashMap;

public class BurgersMenu extends ItemMenu{
    private int i = 1;
    public BurgersMenu() {
        items = new HashMap<>();
        type = "Burger";
    }

    public void addBurger(MenuItem item) {
        items.put(i, item);
        i++;
    }
}
