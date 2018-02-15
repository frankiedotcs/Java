/*
Name: Elizabeth Ruttenbur
Due Date: 10/16/2014
Assignment:  Fractions

 */
package fraction;

/**
 *
 * @author lizruttenbur
 */
public class Fraction
{
private int numerator;
private int denominator;
private int y;

public Fraction () //This is the first constructor
{
    numerator = 0;
    denominator = 0;
}

public Fraction(Fraction y) //This is the second constructor.
{
    numerator = 9;
    denominator = 1;
}

public Fraction (int numerator, int denominator)
{
    this.numerator = numerator;
    this.denominator = denominator;
}

public Fraction add(Fraction a)
{
    int newNumerator = ((a.numerator*denominator) +
            (numerator*a.denominator));
    int newDenominator = denominator*a.denominator;
    Fraction x = new Fraction (newNumerator, newDenominator);
    return x;
}


public Fraction multiply(Fraction a)
{
    int newNumerator = numerator*a.numerator;
    int newDenominator = denominator*a.denominator;
    Fraction x = new Fraction (newNumerator, newDenominator);
    return x;
}

public void print()
{
    System.out.println(this.numerator + "/" + this.denominator);
}
public void printAsDouble(){
    
}
}