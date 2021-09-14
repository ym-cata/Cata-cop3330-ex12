/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;

class SimpleInterest
{
   double principal;
   double rate;
   int years;
   public void read()
   {
       System.out.print("Enter the principal: "); //asks user to input principal
       Scanner sc = new Scanner(System.in);
       this.principal = sc.nextDouble();
       System.out.print("Enter the rate of interest: ");//asks user to input interest 
       this.rate = sc.nextDouble();
       System.out.print("Enter the number of years: ");//asks user to input number of years
       this.years = sc.nextInt();
   }
   public void print()
   {
       int worth = (int)Math.round(principal*(1+rate*years*0.01)); //calculates using the simple interest formula 
       System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+worth ); //prints the investment worth 
      
   }
}
public class Main{
   public static void main(String args[])
   {
       SimpleInterest ca = new SimpleInterest();
       ca.read();
       ca.print();
         
         
   }
}

