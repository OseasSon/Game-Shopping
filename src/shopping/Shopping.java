/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;


/**
 *
 * @author Ken
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean leaveShop = false; 
        int userOpt; // stores the user option
        int menuOpt; // stores the user oprtion from games menu
        int gameRef;
        int gameQnt;
        
        Scanner myKb = new Scanner(System.in); // declaring scanner to receive input from the user.
        
        ShoppingBag myBag = new ShoppingBag(); // this is myBag. I can buy things to put in it.
        
        CheckOut myCheckOut = new CheckOut(myBag.items); // this is myCheckOut. It gives me the total of my purchases.
        
        PrimeCheckOut myPrime = new PrimeCheckOut(myBag.items); // this is myPrime. It gives me 15% discount with a prime subscription.
        
        ProductArray myProducts = new ProductArray(); // this is myProducts. All the itens available are here.        
                    
        Menu myMenu = new Menu(myProducts.gamesList); // this is myMenu. It displays the menu for the client.
        
        myMenu.PrintMenu(); // prints the product's menu
        
        try{
            
            /**
             * This loop gives to the user some options to buy items or leave shop
             * It stops if the user chose leave shop and pay for the purchases
             * In case there is no items the the bag, it thanks the user and then stop
             */
            do{    
                System.out.println("Please, chose one of the options below by entering a number:");
                System.out.println("[1] Add a game to your bag \n[2] Leave Shop");

                menuOpt = myKb.nextInt();

                switch (menuOpt){

                     /**
                      * In this case the user can add as many items as they want to their bag
                      */
                    case 1:

                        System.out.print("\nEnter the reference number of the game you want: ");
                        gameRef = myKb.nextInt();

                        System.out.print("\nEnter the quantity you want: ");
                        gameQnt = myKb.nextInt();

                        for(int i = 1; i <= gameQnt; i++){

                            myBag.buyItem(myProducts.gamesList[gameRef - 1]);// Add the same game to the bag according to the quantity desired
                        }

                        System.out.println("\nYou successfully added " + gameQnt + " " + myProducts.gamesList[gameRef -1].getName() + " game to your bag!");
                        System.out.println("\nPress enter to continue.");
                        myKb.nextLine();
                        myKb.nextLine(); // just wait for user prompt

                        break;

                    /**
                     * This case checks if the user bag is empty
                     * If it is, just thanks the customer
                     * Else, asks if the user has a prime subscription and then proceed to CheckOut
                     */
                    case 2:

                        if (myBag.items.isEmpty()){

                            System.out.println("\nThank you! :)");
                            leaveShop = true;

                        }

                        else{

                            System.out.println("\nDo you have a prime subscription (enter a number)?\n[1] Yes\n[2] No");
                            userOpt = myKb.nextInt();

                            switch (userOpt){

                                case 1: // CheckOut for prime customers

                                    System.out.println("\nThe total of your bag with your prime discount is: $" + myPrime.getTotal());
                                    System.out.println("These are the itens in your bag:");
                                    System.out.println(myBag.emptyBag());
                                    System.out.println("Press enter to confirm payment.");
                                    myKb.nextLine();
                                    myKb.nextLine(); // just wait for user prompt
                                    System.out.println("Thank you and have fun! :)");
                                    leaveShop = true;

                                    break;


                                case 2: // CheckOut for normal customers 

                                    System.out.println("\nThe total of your bag is: $" + myCheckOut.getTotal());
                                    System.out.println("These are the itens in your bag:");
                                    System.out.println(myBag.emptyBag());
                                    System.out.println("\nPress enter to confirm payment.");
                                    myKb.nextLine();
                                    myKb.nextLine(); // just wait for user prompt
                                    System.out.println("Thank you and have fun! :)");
                                    leaveShop = true;

                                    break;
                            }
                        }

                        break;
                }

            } while(!leaveShop);       

         }
        
        catch(Exception e){ // in case the user enter a letter or any other character instead of an int
            
            System.out.println("Please, enter only whole numbers as input.");
        }
    }
    
}
