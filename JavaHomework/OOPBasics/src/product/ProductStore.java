/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product;

import java.util.Collections;
import java.util.LinkedList;


/**
 *
 * @author DigitalNet
 */
public class ProductStore {
    LinkedList<Product> products = new LinkedList<>();
    
    public void addProduct(Product product){
        products.add(product);
    }
    public void addProduct(int productID,String name,float price,int quntity){
        products.add(new Product(productID,name,price,quntity));
    }
    public Product getProductAtIndex(int i){
        return products.get(i);
    }
    public void sortByName(){
        Collections.sort(products, Product.getPoductNameCorparator());
    }
    public int productCount(){
        return products.size();
    }
}
