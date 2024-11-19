package UnitThree.BlackFriday;

import java.util.*;

public class BlackFriday {
    public static final String C_RESET = "\u001B[0m";
    public static final String C_BLACK = "\u001B[30m";
    public static final String C_RED = "\u001B[31m";
    public static final String C_GREEN = "\u001B[32m";
    public static final String C_YELLOW = "\u001B[33m";
    public static final String C_BLUE = "\u001B[34m";
    public static final String C_PURPLE = "\u001B[35m";
    
    public static final String C_CYAN = "\u001B[36m";
    public static final String C_WHITE = "\u001B[37m";

    public static void menu() {
        System.out.println("1. 10% off any one item\n" + //
                        "2. 20% off any one item\n" + //
                        "3. 30% off any one item\n" + //
                        "4. $50 off any item $100 or more\n" + //
                        "5. $25 off any item $100 or more");
    }

    public static double percentOff(double discount) {
        
        

        return discount;
    }

    public static int dollarOff(int dollar) {

        

        return dollar;
    }

    public static String itemCollect(String itemList) {

        

        return itemList;
    }

    public static double pointsCard(double total) {



        return total;
    }

    public static void main(String[] args) {
        final double TAX = .13;
        double price, subtotal, total;
        int itemCount = 1, itemAmount;
        boolean again = true, discount;
        String itemName;

        StringBuilder itemList = new StringBuilder();
        Scanner input = new Scanner(System.in);

        System.out.println("\nHello welcome the Willy Williams Store of Apple Store Store, I Think its a Store. We are having a big Black Friday sale today!"
            + C_RED + "\n\nToday we are offering many discounts you are able to use any of these discounts and all of them more than once!"
            + C_WHITE + "\nHere are all of our discounts today:" + C_RESET);

            menu();

        while (again) {
            // Get item name
            itemName = Input.nonEmptyStringValid(C_YELLOW + "\nPlease enter the name of your " + itemCount + " item: ");
            if (itemName.equals("exit")) {
                again = false;
                break;
            }
            else {
                itemList.append(itemName + " "); // Add item to list with comma
                itemCount++;

                price = Input.doubleValid("Please enter the price of your item: $" + C_RESET); // Item price
                itemList.append("$" + price + "\n");

                System.out.print("Would you like to apply a discount (y/n): ");
                discount = Input.yesNoValid(input.nextLine());
                
                while (discount) {
                    // Add logic to apply a discount or ask for another discount
                    System.out.print("Applying discount... (this is where you would implement discount logic)\n");
                    
                }
                System.out.print("No discounts will be applied.");

            }
        }
    }
}
