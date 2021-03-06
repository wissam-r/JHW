package oopbasics;

import product.*;
import java.util.*;

/**
 *
 * @author Wissam
 */
public class OOPBasics {

    public static void main(String[] args) {
        //testEquals();
        //testSortPrice();
//        testSortName();
        testProductsStore();
    }

    private static void testEquals() {
        Product c1 = new Product(1, "wissam");
        Product c2 = new Product(1, "wissam");
        if (c1.equals(c2)) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }

    private static void testSortPrice() {
        Product c1 = new Product(1, "wissam", 10, 50);
        Product c2 = new Product(2, "lolo", 20, 60);
        Product c3 = new Product(3, "jjjjj", 5, 60);
        Product c4 = new Product(4, "ooooo", 40, 80);

        ArrayList<Product> products = new ArrayList<>();
        products.add(c1);
        products.add(c2);
        products.add(c3);
        products.add(c4);
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product.getPrice());

        }

    }

    private static void testSortName() {
        Product c1 = new Product(1, "wissam", 10, 50);
        Product c2 = new Product(2, "lolo", 20, 60);
        Product c3 = new Product(3, "jjjjj", 5, 60);
        Product c4 = new Product(4, "ooooo", 40, 80);

        ArrayList<Product> products = new ArrayList<>();

        products.add(c1);
        products.add(c2);
        products.add(c3);
        products.add(c4);

        Collections.sort(products, Product.getPoductNameCorparator());

        for (Product product : products) {
            System.out.println(product.getProductName());

        }
    }

    private static void testProductsStore() {
        ProductStore store1 = new ProductStore();
        store1.addProduct(1, "wissam", 10, 50);
        store1.addProduct(2, "lolo", 20, 60);
        store1.addProduct(3, "jjjjj", 5, 60);
        store1.addProduct(4, "ooooo", 40, 80);

        System.out.println("#1 getInstanceCount = " + Product.getInstanceCount());
        System.out.println("#1 productsCout = " + store1.productCount());

        ProductStore store2 = new ProductStore();
        store2.addProduct(1, "wissam", 10, 50);
        store2.addProduct(2, "lolo", 20, 60);

        System.out.println("#2getInstanceCount = " + Product.getInstanceCount());
    }
}
