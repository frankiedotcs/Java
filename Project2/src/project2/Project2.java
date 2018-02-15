    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author lizruttenbur
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
   {
      int x = 0;
      int y = 0;
      int z = 0;
      int w = 0;
      
      System.out.println(" " + " " + "x" + "  " + "  " + "y" +" " + "  " + " " + "z" + " " + " " + "  " + "w" + "  " + "  " + "f" + "  ");
      
      LCiruit(0,0,0,0);
      LCiruit(0,0,0,1);
      LCiruit(0,0,1,0);
      LCiruit(0,0,1,1);
      LCiruit(0,1,0,1);
      LCiruit(0,1,1,0);
      LCiruit(0,1,1,1);
      LCiruit(1,0,0,0);
      LCiruit(1,0,0,1);
      LCiruit(1,0,1,0);
      LCiruit(1,0,1,1);
      LCiruit(1,1,0,0);
      LCiruit(1,1,0,1);
      LCiruit(1,1,1,0);
      LCiruit(1,1,1,1);
      

   }

   public static int LCiruit(int x, int y, int w, int z)
   {
      int f;   
        f = ORlogic(ANDlogic(ANDlogic(NOTlogic(x), NOTlogic(y)), z), 
              ORlogic(ANDlogic(ANDlogic(NOTlogic(z),NOTlogic(x)),w),y));
      
      System.out.println(" " + " " + x + "  " + "  " + y +" " + "  " + " " + z + " " + " " + "  " + w + "  " + "  " + f + "  ");
             
      
      return f;


   }

   public static int ANDlogic(int x, int y)
   {
      // Logical AND function
    char f = 0;
    if (x == 1 && y == 1 ) {
     f = 1;
    }else{
     f = 0;
    }
      
   return f;
   }

   public static int ORlogic(int x, int y)
   {
      
    char f = 0;
    if(x == 0 || y == 0){
     f = 0;
    }else if (x == 1 || y == 1 ) {
     f = 1;
    }else{
     f = 0;
    }
     
   return f;
   }

   public static int NOTlogic(int x)
   {
      // Logical NOT function
    int f = 0;
    if (x == 0)
    f = 1;
    

   return f;
   }

} // end class