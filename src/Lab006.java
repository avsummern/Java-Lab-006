/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 *
 * @since Version 1.0
 */

import java.util.Scanner;
public class Lab006 {
    int n;
    int m;

    /**
     *
     * @param a represents the user-entered numerator
     * @param b represents the user-entered denominator
     */
    public Lab006(int a, int b){
        n = a;
        m = b;
    }

    /**
     * isDivisible takes the instance variables and computes is int n is evenly divisible by m.
     * true is returned if the remainder = 0
     * false is returned if the remainder has any value other than 0
     * @return
     */
    public boolean isDivisible(){
        if (n%m == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * main prompts the user for two numbers, one they want divided then what they want it divided by
     * it then calls isDivisible and uses the result to print an understandable result
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to divide: ");
        int numerator = Integer.valueOf(input.nextLine());
        System.out.println("Please enter the number you want to divide by: ");
        int denominator = Integer.valueOf(input.nextLine());

        Lab006 one = new Lab006(numerator, denominator);

        if (one.isDivisible()){
            System.out.printf("%d divided by %d has no remainder", numerator, denominator);
        }
        else{
            System.out.printf("%d divided by %d has a remainder", numerator, denominator);
        }
    }
}
