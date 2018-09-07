
package larac_lab7;

 //@author Christian
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;

public class LaraC_Lab7 {
    public static int encryp(int Pass)
    {
        return Pass * 3 ;
    }
    public static boolean userFound(boolean found, String User)throws  IOException
    {
        try{
        String testUser = " ";
        FileReader fr = new FileReader("info.txt");
        BufferedReader br = new BufferedReader(fr);
                    while ((testUser = br.readLine()) != null) 
                    {
                        if(testUser.equals(User))
                        {
                            System.out.println("Welcome");
                            found = true;
                            break;
                        }
                    }
                    br.close();
                    
        }
        catch (IOException e)
        {
            System.out.println("File not found");
        }
        return found;
    }
    public static void main(String[] args) throws Exception{
        
        
        int choice;
        boolean loop;
        boolean found;
        boolean invalid;
        int counter = 1;
        String User;
        int Pass;
        do{
            Scanner in = new Scanner(System.in);
            invalid = false;
        try{
        do{ 
        loop = true;
        System.out.println("1. Login\n" + "2. Register\n" + "3. Exit");
        choice = in.nextInt();
        
        switch(choice)
        {
            case 1:
                do{
                found = false;
                counter++;
                System.out.println("\tLogin Menu");
                System.out.println("Please enter User Name");
                User = in.next();
                System.out.println("Please enter Passcode");
                Pass = in.nextInt();
                
                    found = userFound(found, User);
                    if(found == true)
                    {
                        exit(0);
                    }
                    else if(found == false && counter <= 3)
                    {
                        System.out.println("User NOT found. Please try again\n");
                    }
                    else if (counter > 3)
                    {
                        System.out.println("Tryed too many times. Bye\n");
                        //exit the program
                        exit(0);
                    }
                    
                }while(found == false);
                
                break;
            case 2:
                do{
                    found = false;
                    System.out.println("\tRegister Menu");
                    System.out.println("Please enter User Name");
                    User = in.next();
                    System.out.println("Please enter Passcode");
                    Pass = in.nextInt();
                    found = userFound(found, User);
                    if(found == true)
                    {
                        System.out.println("This User Name has already been used\n\tPlease try again\n");
                    }
                }while(found == true);
                
                Pass = encryp(Pass);
                FileWriter fw = new FileWriter("info.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.append(User + "\r\n");
                bw.append(Pass + "\r\n");
                bw.close();
                break;
            case 3:
                loop = false;
                break;
            default:
                System.out.println("Invalid Input\n");
                break;
        }
            
        }while(loop == true);
        }
            catch (Exception e)
            {
                invalid = true;
                System.out.println("Invalid Input\n Try Again\n\n");
                
            }
        }while(invalid == true);
    }
}
