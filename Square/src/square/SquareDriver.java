/*
Name: Elizabeth Ruttenbur
Assignment: Square in class assignment
Due Date: 10/21/2014
 */
package square;
import java.util.Scanner;

/**
 *
 * @author lizruttenbur
 */
public class SquareDriver
    {
    public static void main(String[]args)
    {
        Scanner stdIn = new Scanner(System.in);
        Square square;
    
        System.out.print("Enter width of desired square: ");
        square = new Square (stdIn.nextInt());
        
        System.out.println("Area = " + square.getArea());
        square.draw();
    
    }
}
