//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			SidesMenu.java
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//////////////////////////////////////////////////////////////////////


import java.util.HashMap;

public class SidesMenu extends ItemMenu{
    private int i = 1;
    public SidesMenu() {
        items = new HashMap<>();
        type = "Sides";
    }

    public void addSide(MenuItem item) {
        items.put(i, item);
        i++;
    }
}
