//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			BurgersMenu.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
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