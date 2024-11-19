package UnitThree.Summative;

import java.text.NumberFormat;

public class MethodsSummative {
    public static StringBuilder selectedItems = new StringBuilder(); // Initialize StringBuilder
    private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Global currency formatter

    /**
     * Displays a menu of items and allows the user to select items.
     *
     * @return The total price of the selected items.
     */
    public static double menuItems(String item1, double price1, String item2, double price2, String whichMenu) throws InterruptedException {
        boolean again = true;
        double price = 0;
        int choice;

        while (again) { // Loop to allow multiple selections
            System.out.println(Other.Colour.BOLD_YELLOW + "\n"+ whichMenu + ":" + Other.Colour.RESET);
            choice = Input.intValid("\n1. " + item1 + " - " + currencyFormat.format(price1) + "\n2. " + item2 + " - " + currencyFormat.format(price2) + "\n3. Back to Main Menu\n\n" + Other.Colour.BOLD + "Please select an item: ", 1, 3);
            
            if (choice == 1) { // If item1 is selected
                selectedItems.append(String.format("%-25s %s\n", item1, currencyFormat.format(price1))); // Append selected item
                price += price1; // Accumulate price
            } else if (choice == 2) { // If item2 is selected
                selectedItems.append(String.format("%-25s %s\n", item2, currencyFormat.format(price2))); // Append selected item
                price += price2; // Accumulate price
            } else if (choice == 3) { // Back to Main Menu
                Other.clear(); // Clear screen before returning to main menu
                again = false; // Exit the loop
            }
            Thread.sleep(500);
        }
        return price;
    }

    /**
     * Displays the menu options based on the user's choice and returns the price of the selected item.
     *
     * @return The price of the selected item.
     */
    public static double menuOptions(int menuChoice) throws InterruptedException {
        double itemPrice, price = 0;
        final double BREAKFAST_PRICE_1 = 4.29, BREAKFAST_PRICE_2 = 4.69, BURGERS_PRICE_1 = 6.99, BURGERS_PRICE_2 = 7.99, DRINKS_PRICE_1 = 1.25, DRINKS_PRICE_2 = 2.79, DESSERT_PRICE_1 = 5.19, DESSERT_PRICE_2 = 1.29;
        final String BREAKFAST_ITEM_1 = "McMuffin", BREAKFAST_ITEM_2 = "Hotcakes", BURGERS_ITEM_1 = "Big Mac", BURGERS_ITEM_2 = "Quarter Pounder", DRINKS_ITEM_1 = "Coffee", DRINKS_ITEM_2 = "Coke", DESSERT_ITEM_1 = "McFlurry", DESSERT_ITEM_2 = "Bake Pie";

        switch (menuChoice) {
            //* Displays the breakfast menu and allows the user to select items.
            case 1: // Breakfast
                price = menuItems(BREAKFAST_ITEM_1, BREAKFAST_PRICE_1, BREAKFAST_ITEM_2, BREAKFAST_PRICE_2, "Breakfast Menu");
                return price;
            
            //* Displays the burgers menu and allows the user to select items.
            case 2: // Burgers
                price = menuItems(BURGERS_ITEM_1, BURGERS_PRICE_1, BURGERS_ITEM_2, BURGERS_PRICE_2, "Burgers Menu");
                return price;

            //* Displays the drinks menu and allows the user to select items.
            case 3: // Drinks
                price = menuItems(DRINKS_ITEM_1, DRINKS_PRICE_1, DRINKS_ITEM_2, DRINKS_PRICE_2, "Drinks Menu");
                return price;

            //* Displays the desserts menu and allows the user to select items.
            case 4: // Desserts
                price = menuItems(DESSERT_ITEM_1, DESSERT_PRICE_1, DESSERT_ITEM_2, DESSERT_PRICE_2, "Desserts Menu");
                return price;
        }

        return price; // Ensure a return value
    }

    /**
     * Generates a receipt based on the subtotal of selected items.
     * The receipt is printed even if no items were ordered.
     ** Receipt is still printed even if the user does not order anything, as that is what happens when you exit a kiosk at McDonalds
     */
    public static void receipt(double subtotal) {
        final double TAX = 0.13;
        double total, taxTotal, change, payment;

        taxTotal = subtotal * TAX;
        total = subtotal + taxTotal;

        // Create a currency formatter
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        //Receipt Output
        Other.clear();
        System.out.println("*************" + Other.Colour.BOLD + Other.generateRandomNumber(100, 900) + Other.Colour.RESET + "**************"); // Easter egg, mcdonald's order number
        
        // Output selected items with their prices
        System.out.println("Items Ordered:");
        System.out.printf("%-25s %s\n", "Item", "Price"); // Adjusted width for item name
        System.out.println("------------------------------");
        
        // Format selected items for proper alignment
        String[] lines = selectedItems.toString().split("\n");
        for (String line : lines) {
            System.out.printf("%-25s\n", line); // Ensure each line is formatted correctly
        }

        // Adjusted formatting for subtotal, tax, and total
        System.out.printf("\n%-25s %s\n", "Subtotal:", currencyFormat.format(subtotal));
        System.out.printf("%-25s %s\n", "Tax:", currencyFormat.format(taxTotal));
        System.out.printf("%-25s %s\n", "Total:", currencyFormat.format(total));
        System.out.println("******************************");

        if (total > 0) { // Check if the total amount is greater than zero
            // Prompt the user to enter their payment amount
            payment = Input.doubleValid("\nPlease enter your payment: $", total);

            change = payment - total; // Calculate change by subtracting total from payment

            if (change > 0) { // Check if there is any change to return
                // Inform the user of their change amount
                Other.type("Your change is " + currencyFormat.format(change), 50);
            }
        }
    }

    /**
     * The main method to run the application, allowing users to navigate through the menu.
     */
    public static void main(String[] args) throws InterruptedException {
        int choice, menuChoice;
        double itemPrice = 0, subtotal = 0;
        boolean again = true;

        Other.clear(); // Clear screen so it looks cleaner
        Other.type(Other.Colour.BOLD_YELLOW + "Welcome to McDonald's!", 100);

        while (again) { // Loop to allow multiple menu selections
            Other.type(Other.Colour.RED + "\nMenu Selection", 100);
            Thread.sleep(500);

            choice = Input.intValid(Other.Colour.RESET + "\n1. Breakfast\n2. Burgers\n3. Drinks\n4. Desserts\n5. Exit" + Other.Colour.BOLD_WHITE + "\n\n" + Other.Colour.BOLD + "Please select an option: ", 1, 5);
            
            //^ Displays the menu based on the user's choice and returns the price of the selected item.
            switch (choice) {
                case 1: // Breakfast
                    Other.clear();
                    menuChoice = 1;
                    itemPrice = menuOptions(menuChoice);
                    break;
                case 2: // Burgers
                    Other.clear();
                    menuChoice = 2;
                    itemPrice = menuOptions(menuChoice);
                    break;
                case 3: // Drinks
                    Other.clear();
                    menuChoice = 3;
                    itemPrice = menuOptions(menuChoice);
                    break;
                case 4: // Desserts
                    Other.clear();
                    menuChoice = 4;
                    itemPrice = menuOptions(menuChoice);
                    break;
                case 5: // Receipt
                    receipt(subtotal);
                    again = false;
                    break; // Exit the loop and end the program
                default:
                    System.err.println(Other.Colour.RED + "Invalid choice. Please try again.");
                    break;
            } // Close the switch statement
            subtotal += itemPrice; // Accumulate subtotal
        }
    }
}