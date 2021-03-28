public class GroceryItem {

    private String item;
    private String category;
    private int numberOfItems;


    public GroceryItem(String item, String category, int numberOfItems) {
        this.item = item;
        this.category = category;
        this.numberOfItems = numberOfItems;
    }

    public String getGroceryItem() {
        return this.item;
    }

    public String getGroceryCategory() {
        return this.category;
    }

    public int getNumberOfItems() {
        return this.numberOfItems;
    }
}