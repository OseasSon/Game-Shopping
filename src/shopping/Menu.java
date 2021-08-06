package shopping;

/**
 * A simple Menu class
 * 
 * Allow to display a Menu giving it some array of products
 * 
 * @author oseasfilho
 */

public class Menu {
    
    private Product[] gamesList;

    /**
     * Receive a Product array
     * @param gamesList 
     */
    public Menu(Product[] gamesList) {
        
        this.gamesList = gamesList;
    }
    
    /**
     * Prints a Menu with the products inside gamesList
     */
    public void PrintMenu(){
        
        System.out.println("************* Welcome to GameStation *************\n");
        System.out.println("These are all the games available to purchase.");
        System.out.println("Each one has a reference number inside '[]':\n");
            
        for(int i = 0; i < gamesList.length; i++){
                
            System.out.println("[" + (i+1) + "] " + gamesList[i].toString());
        }
            
        System.out.println("\n*************************************************\n");
    }
    
}
