import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Product> products;

    public ShoppingList() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public int total() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getQuantity();
        }
        return sum;
    }

    @Override
    public String toString() {
        // Join product names using ", "
        return String.join(", ", products.toString()).replace("[", "").replace("]", "");
    }

    public static void main(String[] args) {
        ShoppingList myShoppingList = new ShoppingList();

        // Adding products to the shopping list
        myShoppingList.add(new Product("Apple", 5));
        myShoppingList.add(new Product("Banana", 3));
        myShoppingList.add(new Product("Orange", 2));

        // Printing the shopping list and total quantity
        System.out.println("Products in the shopping list: " + myShoppingList);
        System.out.println("Total number of products: " + myShoppingList.total());
    }
}
