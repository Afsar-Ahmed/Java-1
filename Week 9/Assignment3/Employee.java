import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Afsar Ahmed
 * 991432327
 * Assignment 3
 * 2018-01-03
 */
public class Employee
{
    /**
     * main method executes loop that records how many times the user enters information 
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
        System.out.println(counter);
    }

    public static void workerMon(){
        Worker pt = new Worker();
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

    public static String name(Worker pt){
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

    public static int num(Worker pt){

        Scanner sc = new Scanner(System.in);
        int num=0;
        try{
        System.out.print("Enter Employee Number: ");
        num=sc.nextInt();
        pt.setNumber(num);
        num=pt.getNumber();
    }
    catch(Exception e){
        System.out.println("Please enter a number");
        num(pt);
    }
        
        return num;
    }

    public static double wage(Worker pt){
        Scanner sc = new Scanner(System.in);
        double wage=0;
        try{
        System.out.print("Enter Employee Wage: ");
        wage=sc.nextDouble();
        pt.setWage(wage);
        wage=pt.validWage();
    }
    catch(Exception e){
        wage(pt);
    }
        return wage;
    }

    public static int  hours(Worker pt){
        Scanner sc = new Scanner(System.in);
        int hours;
        System.out.print("Enter Employee Hours: ");
        hours=sc.nextInt();
        pt.setHoursWorked(hours);
        hours=pt.validHours();
        return hours;
    }

}
