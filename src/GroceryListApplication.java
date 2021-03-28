
import util.Input;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApplication {

    public static Input input = new Input();

    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        System.out.println("Welcome to the Grocery List App!");
        boolean userInput = input.yesNo("Would you like to create a grocery list?");

        if(userInput) {
            displayCategories();
            String itemCategory = addGroceryCategory();
            int quantity = input.getInt("How many are you getting?");
            String groceryItem = input.getString("Name of the item:");
            groceryList.add(new GroceryItem(groceryItem, itemCategory, quantity));
            for (GroceryItem item: groceryList) {
                System.out.printf("%s - %s - %s\n", item.getNumberOfItems(), item.getGroceryItem(), item.getGroceryCategory());
            }
        } else {
            System.out.println("Alright, see you again soon!");
        }
    }

    private static void displayCategories(){
        System.out.println("Pick a category for your grocery item:");
        System.out.println();
        System.out.println("1 - Beverage");
        System.out.println("2 - Bread");
        System.out.println("3 - Candy and Snack");
        System.out.println("4 - Canned Goods");
        System.out.println("5 - Condiment");
        System.out.println("6 - Dairy");
        System.out.println("7 - Personal Care Products");
        System.out.println("8 - Cleaning Supplies");
        System.out.println("9 - Paper Products");
        System.out.println("10 - Other");
    }

    private static String addGroceryCategory() {
        int userChoice = input.getInt("Enter your choice: ");
        switch (userChoice) {
            case 1:
                return "Beverage";
            case 2:
                return "Bread";
            case 3:
                return "Candy and Snack";
            case 4:
                return "Canned Goods";
            case 5:
                return "Condiment";
            case 6:
                return "Dairy";
            case 7:
                return "Personal Care Products";
            case 8:
                return "Cleaning Supplies";
            case 9:
                return "Paper Products";
            case 10:
                return "Other";
            default:
                System.out.println("This is not a valid choice");
                return addGroceryCategory();
        }
    }

}