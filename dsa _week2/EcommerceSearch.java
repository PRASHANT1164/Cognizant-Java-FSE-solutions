import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {

    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    void display() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Category : " + category);
    }
}

class SearchOperations {

    // Linear Search
    public static Product linearSearch(List<Product> productList, String key) {

        for (Product item : productList) {
            if (item.name.equalsIgnoreCase(key)) {
                return item;
            }
        }

        return null;
    }

    // Recursive Binary Search
    public static Product binarySearch(List<Product> productList, String key, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        int compare = productList.get(mid).name.compareToIgnoreCase(key);

        if (compare == 0) {
            return productList.get(mid);
        }

        if (compare > 0) {
            return binarySearch(productList, key, left, mid - 1);
        }

        return binarySearch(productList, key, mid + 1, right);
    }
}

public class EcommerceSearch {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", "Electronics"));
        products.add(new Product(102, "Mobile", "Electronics"));
        products.add(new Product(103, "Shoes", "Fashion"));
        products.add(new Product(104, "Watch", "Accessories"));

        String searchItem = "Mobile";

        System.out.println("----- Linear Search -----");

        Product linearResult = SearchOperations.linearSearch(products, searchItem);

        if (linearResult != null) {
            linearResult.display();
        } else {
            System.out.println("Product not found.");
        }

        Collections.sort(products, Comparator.comparing(p -> p.name));

        System.out.println("\n----- Binary Search -----");

        Product binaryResult = SearchOperations.binarySearch(
                products,
                searchItem,
                0,
                products.size() - 1
        );

        if (binaryResult != null) {
            binaryResult.display();
        } else {
            System.out.println("Product not found.");
        }
    }
}