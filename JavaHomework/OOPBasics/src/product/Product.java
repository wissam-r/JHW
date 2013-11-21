

package product;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Wissam
 */
public class Product implements Comparable<Product>{
    
    private int productID ;
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    private String productName ;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    private float price ;
    public float getPrice() {
        return price;
    }
    public void setPrice(float  price) {
        this.price = price;
    }

    private int quanity ;    
    public int getQuanity() {
        return quanity;
    }
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    
    private static int InstanceCount = 0;

    public static int getInstanceCount() {
        return InstanceCount;
    }
    
            
    public Product (int productID , String ProductName){
        setProductID(productID);
        setProductName(ProductName);
        InstanceCount++;
    }
    public Product (int productID , String productName , float price  ,int quanity){
        this(productID,productName) ;
        setPrice(price);
        setQuanity(quanity);
    }
    public Product (){
        this (0,"NoName",0,0) ;
    
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.productID != other.productID) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (this.quanity != other.quanity) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Product o) {
        return (int)(this.getPrice() - o.getPrice()) ;
    }
    public static Comparator<Product> getPoductNameCorparator(){
        return new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getProductName().compareTo(o2.getProductName()) ;
        }
        } ;
    }
}
    
//    public static PoductNameCorparator  getPoductNameCorparator(){
//        return new PoductNameCorparator();
//    }

//class PoductNameCorparator implements Comparator<Product>{
//
//        @Override
//        public int compare(Product o1, Product o2) {
//            return o1.getProductName().compareTo(o2.getProductName()) ;
//        }
//}
