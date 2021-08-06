/**
 * SOME EXPLANATION.
 * 
 * I tried to not change this class, but in order to make my project works I needed to change two things:
 * 
 * 1. Changed ArrayList from private to protected
 * 2. Changed ArrayList type from Object to Product
 */
package shopping;

import java.util.ArrayList;

/**
 * A simple ShoppingBag
 * 
 * Stores items in an ArrayList
 * 
 * Possible to add  items
 * Also can "empty" the bag
 * 
 * You should NOT need to amend this code at all!
 * 
 * @author Ken
 */
public class ShoppingBag {
    
    protected ArrayList<Product> items;
    
    /**
     * Create a shopping bag by initialising the items to an empty arraylist
     */
    public ShoppingBag(){
        
        items = new ArrayList<Product>();
    }
    
    /**
     * Add an item to the shopping bag
     * @param someItem the item that has been bought
     */
    public void buyItem(Product someItem){
        
        this.items.add(someItem);
    }
    
 
    /**
     * create a formatted String containing all the items in the ShoppingBag
     * @return the formatted String
     * Also clears the items list
     */
    public String emptyBag(){
        
        String itemList = "";
        
        for(Product item: this.items){
            
            itemList = itemList + item.toString() + "\n";
        }
        
        this.items.clear();
        
        return itemList;
    }
}
