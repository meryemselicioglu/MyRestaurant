//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			SidesMenu.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
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