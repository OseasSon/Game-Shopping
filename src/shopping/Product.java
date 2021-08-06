package shopping;

/**
 * A simple product class
 * 
 * Allow to create any product giving it name and price
 * 
 * @author oseasfilho
 */

public class Product {
    
    private String name;
    private double price;
    
    /**
     * Create the product
     * @param name - product name
     * @param price - product price
     */
    public Product(String name, double price){
        
        this.name = name;
        this.price = price;   
    }
    
    /**
     * @return the product's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the product's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return a String containing the product's name and price
     */
    @Override
    public String toString() {
        return name + " ---> Price: $" + price;
    }
    
}


