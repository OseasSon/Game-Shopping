package shopping;

/**
 * An array that stores products
 * 
 * Create products using class Products
 * 
 * @author oseasfilho
 */

public class ProductArray {
    
    protected Product[] gamesList;
    
    /**
     * Create 10 games and store it in gamesList
     */
    protected ProductArray() {
    
    gamesList = new Product[10];
    
    gamesList[0] = new Product("Mario", 40);
    gamesList[1] = new Product("Zelda", 40);
    gamesList[2] = new Product("Pokemon", 30);
    gamesList[3] = new Product("Final Fantasy", 40);
    gamesList[4] = new Product("Doom", 40);
    gamesList[5] = new Product("Dokey Kong", 30);
    gamesList[6] = new Product("Sonic", 20);
    gamesList[7] = new Product("Mega Man", 20);
    gamesList[8] = new Product("Dragon Quest", 30);
    gamesList[9] = new Product("Street Fight", 20);
    
    }
    
}
