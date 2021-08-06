package shopping;

import java.util.ArrayList;

/**
 * A special CheckOut for clients with prime subscription
 * 
 * It gives discount on CheckOut
 * 
 * It is a extended class of CheckOut
 * 
 * @author oseasfilho
 */

public class PrimeCheckOut extends CheckOut {

    /**
     * Receive all items in the bag
     * @param items 
     */
    public PrimeCheckOut(ArrayList<Product> items) {
        super(items);
    }

    /**
     * Override the getTotal method to give it 15% discount on CheckOut
     * @return 
     */
    @Override
    public double getTotal() {
        return super.getTotal() * 0.85; // Discount of 15%
    }
}
