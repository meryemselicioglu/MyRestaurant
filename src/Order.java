//////////////////////////////////////////////////////////////////////
//Main Class File:	Restaurant.java
//Files: 			Order.java
//Semester: 		CIS 263-001 Spring 2021
//
//Author: 			Meryem Selicioglu
//Email: 			meryemselici2000@gmail.com
//Instructor:		Micheal Henson
//////////////////////////////////////////////////////////////////////


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
	
	Map<String, Integer> currentOrder; //save keys and quantities
	public double subTotal; //running subtotal
	
	public Order(Menu menu) {
		this.currentOrder = new HashMap<>();
		this.subTotal = 0.00;
	}
	
	public void enterQuantity(Scanner in, MenuItem menuItem) {
		String key = menuItem.name;
		double price = menuItem.price;
		System.out.println("Enter quantity of "+key+": ");
		String val = in.nextLine();
		try {
			int quantity = Integer.parseInt(val);
			if (currentOrder.containsKey(key)) {
				int orderedQuantity = currentOrder.get(key);
				orderedQuantity += quantity;
				if (orderedQuantity > 0) {
					currentOrder.replace(key, orderedQuantity);
					subTotal += price * quantity;
				} else {
					subTotal -= currentOrder.get(key) * price;
					currentOrder.remove(key);
				}
				
			} else {
				if (quantity > 0) {
					double priceForQuantity = price * quantity;
					currentOrder.put(key, quantity);
					subTotal += priceForQuantity;
				}
			}
			System.out.println("\nCurrent subtotal: $"+subTotal);
		} catch (NumberFormatException e) {

		}
	}

	public int getQuantity(String key) {
		return currentOrder.get(key);
	}
	
}
