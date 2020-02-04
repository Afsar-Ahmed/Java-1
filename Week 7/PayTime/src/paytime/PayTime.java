
package paytime;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Afsar Ahmed
 * 991432327
 * Assignment 3
 * 2018-01-03
 */
public class PayTime
{
    /**
     * main method executes loop that records how many 
     * times the user enters information 
     * regarding the Workers(and some other wordy stuff)
     */
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner (System.in);
        int counter=0;
        String say="";
    do{
     System.out.println("Enter Y to process a worker or any other key to end");
            say=sc.next();
            if(say.equalsIgnoreCase("y")){
                workerMon();
                counter++;
            }

        }
        while(say.equalsIgnoreCase("y"));
        System.out.println("Total number of Employees processed: " + counter);
        System.out.println("End of Program");
    }
    /**
     * This method focuses on the main actions of the program
     */

    public static void workerMon(){
        Employee pt = new Employee();
        DecimalFormat d = new DecimalFormat("#0.00");
        Scanner sc = new Scanner(System.in);

        int num=num(pt);
        String name=name(pt);
        int hours=hours(pt);
        double wage=wage(pt);
        double weeklyPay,incomeTax, regNetPay, overNetPay, totalNetPay;

        weeklyPay=pt.getWeeklyPay(hours, wage);
        incomeTax=pt.getIncomeTax(weeklyPay);
        regNetPay=pt.getNetPay(incomeTax,weeklyPay);

        System.out.println("Worker " + num + " PayCheck Information:");
        System.out.println("Name is: " + pt.getName());
        System.out.println("Weekly Pay is: " + d.format(weeklyPay));
        System.out.println("Income Taxes is: " + d.format(incomeTax));
        System.out.println("Net Pay is: " + d.format(regNetPay)); 
        System.out.println();
        if(hours>40){
       weeklyPay=pt.getWeeklyPay(wage, hours);
       incomeTax=pt.getOverTax(weeklyPay);
       overNetPay=pt.getNetPay(incomeTax,weeklyPay);
       totalNetPay=regNetPay+overNetPay;

       System.out.println("Worker " + num + " OverTime Information:");
       System.out.println("Name is: " + pt.getName());
       System.out.println("OverTime Pay is: " + weeklyPay);
       System.out.println("OverTime Tax is:" + d.format(incomeTax));
       System.out.println("Overtime Net Pay is: " + d.format(overNetPay));
       System.out.println("Overtime Total Pay is: " + d.format(totalNetPay));

     }

    }
    /**
     * this method allows the user to type in their name
     * @param pt is an object of the Employee class.
     * @return a variable which holds the first and  last names.
     */

    public static String name(Employee pt){
        Scanner sc = new Scanner(System.in);
        String f="",l="";
        String name;

        System.out.print("Enter Employee First Name: ");
        f=sc.nextLine();
        pt.setFirstName(f);
        System.out.println();
        System.out.print("Enter Employee Last Name: ");
        l=sc.nextLine();
        pt.setLastName(l);
        name = f+ " " + l;
        return name;

    }

    /**
     * Asks user for a number
     * @param pt
     * @return num that stores what the value the user inputted
     */
    public static int num(Employee pt){

        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.print("Enter Employee Number: ");
        num=sc.nextInt();
        pt.setNumber(num);
        num=pt.getNumber();
        return num;
    }

    /**
     * Asks user for wage
     * @param pt
     * @return 
     */
    public static double wage(Employee pt){
        Scanner sc = new Scanner(System.in);
        double wage;

        System.out.print("Enter Employee Wage: ");
        wage=sc.nextDouble();
        pt.setWage(wage);
        wage=pt.validWage();
        return wage;
    }

    /**
     * Asks user for hours
     * @param pt
     * @return 
     */
    public static int  hours(Employee pt){
        Scanner sc = new Scanner(System.in);
        int hours;
        System.out.print("Enter Employee Hours: ");
        hours=sc.nextInt();
        pt.setHoursWorked(hours);
        hours=pt.validHours();
        return hours;
    }

}
