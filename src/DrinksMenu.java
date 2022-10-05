//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			DrinksMenu.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
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