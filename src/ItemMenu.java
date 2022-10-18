//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			ItemMenu.java
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
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
