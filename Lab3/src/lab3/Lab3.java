
package lab3;
// inpoting java utilities
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 
{ // main function
    public static void main(String[] args) 
    { // declaring the scanner
        Scanner enter = new Scanner(System.in);
        //declaring 3 different choices to store the choice
        int choice, choice2, choice3;
        //bolen loop to loop untill exit is selected and empty to test for empty items
        boolean loop, empty;
        //total to store the sum of objects
        double total = 0;
        //stores the quatities of each item
        int speQuan = 0, comQuan = 0, usbQuan = 0, mouQuan = 0, keyQuan = 0;
        
        
       //class name , name of object, new from class
        item item = new item();
        cart cart = new cart();
     do
     { 
         // set loop to true so it loops altmost infinitevely
        loop = true;
        //main menu
        System.out.print("Pick an item with menu\n" +
                        "\t1. View Store Items" +
                         "\n\t2. View Cart" +
                         "\n\t3. Exit" +
                         "\nYour Selection: ");
        choice = enter.nextInt();
        // switch statement to decide what option to get on the main menu
        switch (choice)
        {
            // if enter a 1 the item list will be displayed and the user can choose one
        case 1:
            //shows item menu
                item.viewItems();
                //gets the input from user for choice
                 System.out.print("Your Selection: ");
                choice2 = enter.nextInt();
                //switch statement to decide which item the user whants to see
                switch (choice2)
                {
                    //if choice2 = 1 the speakes menu will appera
                    case 1:
                        item.speaker();
                        choice3 = enter.nextInt();
                        //user can chose to add the item tto cart or go back to main menu
                         if (choice3 == 1)
                        {// This applies to all if statements in this switch
                        total += 20.00; //adds the value of the item to the total
                        speQuan += 1; // adds one to the counter so the user can buy multiple products
                        System.out.println("This item has been added to your cart.");
                        }
                        break;
                        //if choice2 = 2 the user wil be promted to the computer menu
                    case 2:
                    item.computer();
                    choice3 = enter.nextInt();
                    // user get to chose to add the item or go back to main menu
                        if (choice3 == 1)
                        {
                        total += 500.00; 
                        comQuan += 1;
                        System.out.println("This item has been added to your cart.");
                        }
                        break;
                        //user gets the usb menu 
                    case 3:
                    item.usb();
                    choice3 = enter.nextInt();
                    //user gets the chance to add the item to cart or go back to main menu
                    if (choice3 == 1)
                        {
                        total += 15.00;
                        usbQuan += 1;
                        System.out.println("This item has been added to your cart.");
                        }
                        break;
                        //user gets the mouse menu
                    case 4:
                        item.mouse();
                        choice3 = enter.nextInt();
                        //user gets the chance to add to cart or go back
                        if (choice3 == 1)
                            {
                            total += 10.00;
                            mouQuan += 1;
                            System.out.println("This item has been added to your cart.");
                            }
                        break;
                        //user gets the keyboard menu
                    case 5:
                    item.keyboard();
                    choice3 = enter.nextInt();
                    //user can add to cart or go back
                    if (choice3 == 1)
                        {
                        total += 30.00;
                        keyQuan += 1;
                        System.out.println("This item has been added to your cart.");
                        }
                        break;
                        // breaks the switch and goes back to main menu
                    case 6:
                        break;  
                
                    default:
                        //for invalid input 
                        System.out.println("Invalid input");
                        break;
                }
       
                        //invalid = true;
                break;
                // case 2 of the main switch view cart
        case 2:
            
            empty = true;
            //sets empty to true if the counter for each product is more than 0 it will be displayed
            //and set empty to false so if only one item is in cart the empty gets turned to false
            System.out.println("Products on youtr cart");
            if (speQuan > 0)
            {
                empty = false;
                System.out.println(speQuan + " Speaker");
            }
            if (comQuan > 0)
            {
                empty = false;
                System.out.println(comQuan + " Computer");
            }
            if (usbQuan > 0)
            {
                empty = false;
                System.out.println(usbQuan + " USB");
            }
            if (mouQuan > 0)
            {
                empty = false;
                System.out.println(mouQuan + " Mouse");
            }
            if (keyQuan > 0)
            {
                empty = false;
                System.out.println(keyQuan + " Keyboard");
            }
            if (empty == true)
            {
                 System.out.println("Cart is empty");
            }
            
            //shows the view cart menu
            cart.viewCart();
            //prompts for choice2 and overwrittes it if is already been used
            choice2 = enter.nextInt();
            //inside the view cart menu this swithc will give a few more options
            switch(choice2)
            {
                //if choice 2 =1 the total will be displayed and the cart will be emptied
                case 1:
                    System.out.println("Your total is: " + total);
                    speQuan = 0; 
                    comQuan = 0; 
                    usbQuan = 0; 
                    mouQuan = 0; 
                    keyQuan = 0;
                    total = 0;
                   // invalid = true;
                    break;
                    // if choice2 = 2 the user gets chance to remove items
                case 2:
                    //lets user know what is goin on
                    System.out.println("Remove items from cart");
                    //empty is reset to tru just in case somthing has changed
                    empty = true;
                    //displays the items in the cart and sets empty to false
            System.out.println("Products on youtr cart");
            if (speQuan > 0)
            {
                empty = false;
                System.out.println(speQuan + " Speaker");
            }
            if (comQuan > 0)
            {
                empty = false;
                System.out.println(comQuan + " Computer");
            }
            if (usbQuan > 0)
            {
                empty = false;
                System.out.println(usbQuan + " USB");
            }
            if (mouQuan > 0)
            {
                empty = false;
                System.out.println(mouQuan + " Mouse");
            }
            if (keyQuan > 0)
            {
                empty = false;
                System.out.println(keyQuan + " Keyboard");
            }
            if (empty == true)
            {
                 System.out.println("Cart is empty");
            }
            //displays items menu to let user know what button s to press
                    item.viewItems();
                    // choice two is reused to get input
                    choice2 = enter.nextInt();
                    //this switch statement will remove the price and the counter of any item selected
                switch (choice2)
                {
                    
                    case 1:
                        total -= 20.00;
                        speQuan -= 1;
                        break;
                        
                    case 2:
                        total -= 500.00;
                        comQuan -= 1;
                        break;
                        
                    case 3:
                        total -= 15.00;
                        usbQuan -= 1;
                        break;
                        
                    case 4:
                            total -= 10.00;
                            mouQuan -= 1;
                        break;
                        
                    case 5:
                        total -= 30.00;
                        keyQuan -= 1;
                        break;
                        
                    case 6:
                        break;  
                
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                    break;
                    
                case 3:
                    //invalid = true;
                    break;
                
                default:
                    System.out.println("Wrong input");
            }
                    
            break;
        // third main menu case will exit the console
        case 3:
            loop = false;
            break;
            
        default: // used to validate the first choice
            System.out.println("Please enter number 1-3");
           // invalid = true;
        }
            
        
       }while(loop == true);
     
    }
}
