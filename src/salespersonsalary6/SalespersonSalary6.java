package salespersonsalary6;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class SalespersonSalary6 
{

    
    public static void main(String[] args) 
    {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Double> yearlySales = new ArrayList<>();
        
        
        Scanner keyboard = new Scanner(System.in);
        //Create a Scanner object for keyboard input.
        
    DecimalFormat currencyFormat = new DecimalFormat("##,###");
        //Configures number output format.  
    
    
         System.out.println("Enter the first employee.");
               nameList.add(keyboard.nextLine());
                  //Accepts input for fist individual's name.
         System.out.println("Enter the second employee.");
               nameList.add(keyboard.nextLine());
                  //Accepts input for second individual's name.
         System.out.println("Enter the yearly sales for employee 1. ");
               yearlySales.add(keyboard.nextDouble()); 
                  // sales for the first employee.
         System.out.println("Enter the yearly sales for employee 2. ");
               yearlySales.add(keyboard.nextDouble());
                  // sales for the second employee
    
        for (int list = 0; list < nameList.size(); list++){
            
            
     
        {
              //Components of Commission
             int SalesTarget = (10000);
              // Declares a sales target.
             double number;
              // Loop control variable
        
     
    //Closing comments for Salesmen
     if (yearlySales.get(list) >= SalesTarget)// sales greater than sales target
{  
        System.out.println("           Potential Sales Table            ");
        System.out.println("                                            ");
        System.out.println("Potential Sales\t\t\tPotential Compensation");
        System.out.println("-------------------------------------------------"
                + "----");
        // Formatting and text for chart
    for (number = yearlySales.get(list) + 5000; number <= yearlySales.get(list)
            * 1.5; number += 5000)
    {
        System.out.println(number + "\t\t\t\t\t"
                + currencyFormat.format((number * .3) + 20000));
        // Chart layout
        System.out.println("");
        // create blank space.
    }
}
    else
        System.out.println(" Try harder to earn more sales.");
       // Closing statement.
    }
        }   
        if (yearlySales.get(0) > yearlySales.get(1)){
            //perameters for output
            System.out.println( nameList.get(1) + " would make commission equal"
                     + " to " + nameList.get(0) + ", if he/she would have made " 
                              + currencyFormat.format(yearlySales.get(0) 
                                 - yearlySales.get(1)) + " more sales.");
            //determines gap between sales.
        }
    else
            
        if
           (yearlySales.get(1) > yearlySales.get(0))
            //perameters for output
        {  
            System.out.println( nameList.get(0) + " would make commission equal"
                     + " to " + nameList.get(1) + ", if he/she would have made " 
                              + currencyFormat.format(yearlySales.get(1) 
                                 - yearlySales.get(0)) + " more sales.");
            //determines gap between sales.
        }
    else
            System.out.println("We cant determine commission data.");
            //Closing statement.
  }
}
