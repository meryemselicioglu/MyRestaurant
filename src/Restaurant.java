//Title: 		Meryem's Restaurant
//Files: 		Restaurant.java, Order.java, Menu.java, MenuItem.java, 
//       		ItemMenu.java, Menu.txt, BurgersMenu.java, DrinksMenu.txt, SidesMenu.txt
//
//Author: 		Meryem Selicioglu
//Email: 		meryemselici2000@gmail.com



import java.io.File;
import java.util.Scanner;

public class Restaurant {
    public static double sales = 0;

    public static boolean isValidCategory(String cat) {
        try {
            int i = Integer.parseInt(cat);
            return i > 0 && i < 4;
        } catch(Exception e) {
            return false;
        }
    }

 
    public static boolean isValidOrderValue(String val, int max) {
        if(val == null || val.equals("")) {
            return false;
        }
        try {
            int intValue = Integer.parseInt(val);
            return intValue > 0 && intValue <= max;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Meryem's Restaurant\n");
        Scanner input = new Scanner(System.in);
        File file = new File(args[0]);
        Menu menu = new Menu(file);
        System.out.println("Please type 'start order' to begin ordering or anything else to leave the restaurant.");
        String answer = input.nextLine();
        while (answer.toLowerCase().equals("start order")) { 
            Order order = new Order(menu);
            menu.printCategories();
            System.out.println("\nPlease type (1-3) for the category you want to see:");
            String category = input.nextLine();            
            while(isValidCategory(category)) {
                int choice = Integer.parseInt(category);
                ItemMenu im = menu.menu.get(choice);
                im.printItemMenu();
                System.out.println("\nPlease select (1-"+im.ItemMenuSize()+") to choose your "+im.getType());
                String itemChoice = input.nextLine();
                if(isValidOrderValue(itemChoice, im.ItemMenuSize())) {
                    int item = Integer.parseInt(itemChoice);
                    MenuItem menuItem = im.getItem(item);
                    order.enterQuantity(input, menuItem);
                } else { 
                    if (!itemChoice.toLowerCase().equals("back")) {
                        System.out.println("Not a valid order item");
                    }
                }
                menu.printCategories();
                System.out.println("Please type (1-3) for the category you want to see or press the enter key to finish:");
                category = input.nextLine();
            }
            for(String i : order.currentOrder.keySet()) {
                System.out.println(order.getQuantity(i)+ " x " + i);
            }
            System.out.println("Your total: $"+order.subTotal);
            System.out.println("Thank you, come again!");	
            System.out.println("\nPlease type 'start order' to begin ordering or anything else to leave the restaurant.");
            answer = input.nextLine();
        }
        
    }
 }
