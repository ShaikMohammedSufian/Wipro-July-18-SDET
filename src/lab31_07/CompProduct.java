package lab31_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompProduct implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		
		//return p1.price - p2.price;//ascending order
		// do we use if else?? for this??
		return p1.name.compareTo(p2.name);
	}

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

        products.add(new Product(50000, "Laptop"));
        products.add(new Product(30000, "TV"));
        products.add(new Product(30000, "Desktop"));
        products.add(new Product(5000, "Zebronics"));
        products.add(new Product(1000, "Pen Drive"));

        // Sort using ProductComparator
        Collections.sort(products, new CompProduct());

        // Print sorted list
        for (Product p : products) {
            System.out.println(p);
        }
	}

}
