/***************************
* Name: Liz Ruttenbur
* Due Date:9/11/2014
* Date : 9/11/2014
* Assignment: 4 Inclass Assignment 1
****************************/

package zipcode;

/**
 *
 * @author Elizabeth Ruttenbur
 */
import java.util.Scanner;
public class Zipcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);
       
    // variables
       String zip;
    //Print Statement and Input   
       System.out.println("Enter a Zip Code");
       zip = stdIn.nextLine();
       
       //switch statement
       switch (zip.charAt(0))
       {
           case '0': case '2': case'3':
               
              System.out.println(zip + " is on the East Coast");
        break;
           case '4': case '5': case'6':
               
               System.out.println(zip + " is in the Central Plains");
        break;
           case '7':
               
                System.out.println(zip + " is in the South");
        break;
           case '8': case '9':
                   
                System.out.println(zip + " is in the West");
        break;
           default:
               System.out.println(zip + " is an invalid Zip code");
       }
       }//end code
       
    }
    

