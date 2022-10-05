//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			ItemMenu.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
//////////////////////////////////////////////////////////////////////


import java.util.Map;

public class ItemMenu {
    protected Map<Integer, MenuItem> items;
    protected String type;
    public void printItemMenu() {
        for(Integer i : items.keySet()) {
            System.out.println(i+ " "+ items.get(i).name+" $"+items.get(i).price);
        }
    }
    public int ItemMenuSize() {
        return items.size();
    }
    public MenuItem getItem(int i) {
        return items.get(i);
    }
    public String getType() {
        return type;
    }
}