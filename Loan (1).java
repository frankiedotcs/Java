/*
Elizabeth Ruttenbur
Loan Payments and Balance Recursion Assignment
Comments: I did this in just a couple hours, so ummm... it works. Just not
not perfectly, but that's OK! 
 */

/**
 *
 * @author P5E
 */
 import java.util.Scanner;
public class Loan {
    
    

private double loanAmount;
private int numberOfPayments;
private double rate;
double monthlyPayment;

//You go constructor... you go...
public Loan(double a, double r, int n){
   loanAmount = a;
   rate = r;
   numberOfPayments = n;
}

//THE GETTERS!!!!! 
public double getAmount() {
        return this.loanAmount;
    }

    public double getRate() {
        return this.rate;
    }

    public int getNumOfPayments() {
        return this.numberOfPayments;
    }


//calculates the monthly payment
public double monthlyPayments(){

return (loanAmount*rate) / (1-Math.pow((1+rate), - numberOfPayments));

}



// so this is my recursion method. Yup. Math man... math.
public void loanPayments(int p, double b) {
   

             double balance = b+(b*rate);

	     b = balance - monthlyPayments();             
             
            
                                    
	System.out.println("payment# " + p + " balance = " + Math.round(balance*100)/100.00);
             if (b<=0 && p>=numberOfPayments){
                 b=0;
                }
                else {
                    loanPayments(++p, b);
                 // for the life of me I cannot figure why it's adding 250 bucks.   
                }
}
}
