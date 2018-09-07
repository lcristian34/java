
package lab3;





//items menu
public class item 
{// used for the view items menu
    public void viewItems()
    {
        System.out.println("\n1. Speaker");
        System.out.println("2. Computer");
        System.out.println("3. USB");
        System.out.println("4. Mouse");
        System.out.println("5. Keyboard");
        System.out.println("6. Go back to main menu");
    }
    //used for the speaker menu
    public void speaker()
    {
        
        System.out.println("\nSpeaker");
        System.out.println("A pair of mini computer speakers, conect via USB");
        System.out.println("$20.00\n");
        System.out.println("1. Add to cart");
        System.out.println("2. Back");
    }
    //used for the computer menu
     public void computer()
    {
        System.out.println("\nComputer");
        System.out.println("A laptop with 1 tera of storage and a i5 intel processor");
        System.out.println("$500.00\n");
        System.out.println("1. Add to cart");
        System.out.println("2. Back");
    }
     //used for usb menu
      public void usb()
    {
        System.out.println("\nUsb");
        System.out.println("Usb stick, 64 gigs of storage, usb 3.0 type");
        System.out.println("$15.00\n");
        System.out.println("1. Add to cart");
        System.out.println("2. Back");
    }
      //used for mouse menu
       public void mouse()
    {
        System.out.println("\nMouse");
        System.out.println("Wirless mouse with 5 buttons");
        System.out.println("$10.00\n");
        System.out.println("1. Add to cart");
        System.out.println("2. Back");
    }
       //used for keyboard menu
        public void keyboard()
    {
        System.out.println("\nKeyboard");
        System.out.println("Mechanical keyboard, with backlight keys in color blue");
        System.out.println("$30.00\n");
        System.out.println("1. Add to cart");
        System.out.println("2. Back");
    }
}
