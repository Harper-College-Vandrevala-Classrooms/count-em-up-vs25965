package com.csc;
import java.util.Scanner;

public class GroceryCounter {
  

int [] _counters = {0,0,0,0};
public static void main(String[] args)
{
  GroceryCalculations increase = new GroceryCalculations();
  

  System.out.println("welcome to the Count'em Up! Lab This is default value: ");
  increase.total();
  System.out.println("Enter the number of the hundreds place: ");
  Scanner in = new Scanner(System.in);
  int _Tcounter = in.nextInt();
  increase.hundeths(_Tcounter);
  System.out.println("Enter the number to store in the tenths place: ");
  int _Tcounter2 = in.nextInt();
  increase.tenths(_Tcounter2);
  System.out.println("Enter the number to store in the ones place: ");
  int _Tcounter3 = in.nextInt();
  increase.ones(_Tcounter3);
  System.out.println("Enter the number to store in the tens place: ");
  int _Tcounter4 = in.nextInt();
  increase.tens(_Tcounter4);
  in.close();

  System.out.println("This is now your total: ");
  increase.total();
  increase.number_of_overflows();
  
  increase.clear();
  System.out.println("To start over, the program return to defalt values: ");
  increase.total();
  increase.number_of_overflows();
        
}



}
