//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			MenuItem.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
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