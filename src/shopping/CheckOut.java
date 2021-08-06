package shopping;
import java.util.ArrayList;

/**
 * A CheckOut class
 * 
 * Receive the items in the ShoppingBag and sum up their prices
 * 
 * @author oseasfilho
 */

public class CheckOut {
    
    private double total;
    private ArrayList<Product> items;
    
    /**
     * Receive all items in the bag
     * @param items 
     */
    public CheckOut(ArrayList<Product> items){
        
        this.items = items;
    }
    
    /**
     * @return the total price of the bag
     */
    public double getTotal() {
        
        for(Product game:items){
        
            total += game.getPrice();   
        }      
        
        return total;
    }
    
}