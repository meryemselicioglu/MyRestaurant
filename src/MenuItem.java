//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			MenuItem.java
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//////////////////////////////////////////////////////////////////////


public class MenuItem {
    public String type;
    public String name;
    public double price;

    public MenuItem(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "(" + type + ") " + name + " $" +price;
    }
}
