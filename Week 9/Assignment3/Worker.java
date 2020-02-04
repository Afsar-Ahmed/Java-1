import java.util.Scanner;
/**
 * Write a description of class PayTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Worker
{
    // instance variables - replace the example below with your own
    private int number;
    private String firstName;
    private String lastName;
    private int hoursWorked;
    private double wage;

    /**
     * Sets a value for the class variable number
     * @param num - a value set by the user
     */
    public void setNumber(int num){    
        this.number=num;       
    }
    
    /**
     * Sets a value for the class variable firstName
     * @param fn - a value set by the user
     */
    public void setFirstName(String fn){
        this.firstName=fn;        
    }
    
    /**
     * Sets a value for the class variable number
     * @param num - a value set by the user
     */
    public void setLastName(String num){
        this.lastName=num;
    }
    
    /**
     * Sets a value for the class variable number
     * @param num - a value set by the user
     */
    public void setHoursWorked(int hw){
        this.hoursWorked=hw;
    }
    
        public void setWage(double w){
        this.wage=w;
    }

    /** @param number: a value from main method.
     *  Checks if the number is in the array of numbers.
     *  If not, it will display a message and 
     *  prompt the user to type again.
     * 
     */
    public int getNumber()
    {
        Scanner sc = new Scanner(System.in);
        try{
        switch(this.number){
            case 101:return this.number;
            case 103:return this.number;
            case 106:return this.number;
            case 109:return this.number;
            case 110:return this.number;
            case 113:return this.number;
            case 116:return this.number;
            case 118:return this.number;
            case 120:return this.number;
            default:
            {System.out.print("Invalid, enter proper employee number: ");
                 number=sc.nextInt();
                 return getNumber();

                }

            }
        }
        catch(Exception e){
            System.out.print("Invalid. must type in an integer");
            this.number=sc.nextInt();
            return getNumber();
        }

    }

    /**
     * Validates hoursWorked    
     */
    public int validHours(){
        Scanner sc = new Scanner(System.in);
       
        if(this.hoursWorked>=0){
            return this.hoursWorked;
        }

        else{
            System.out.println("Negative hours not allowed");
            System.out.print("Enter hours worked: ");
            this.hoursWorked=sc.nextInt();
            return validHours();

           }
        
    }
    
    public double validWage(){
        Scanner sc = new Scanner(System.in);
        if(this.wage>-1){
            return this.wage;
            
        }
        else{
            System.out.println("Negative wage not allowed");
            System.out.print("Enter hourly wage: ");
            this.wage=sc.nextDouble();
            return validWage();
        }
        
    }
    
    /**
     * Calculates the weekly Pay using information given
     *
     * 
     * @return    the sum of x and y
     */
    public double getWeeklyPay(int hoursWorked,double wage)
    {        
        double weeklyPay = hoursWorked * wage;
        return weeklyPay;
    }
    
    /**
     * Calculates the overpay using information given
     */
    public double getWeeklyPay(double wage,int hoursWorked){
     double weeklyOverPay = hoursWorked * (wage * 1.5);
     return weeklyOverPay;
    }

    /**
     * Calculates the income tax using information given
     * which is dependant on the value of weeklyPay
     * @param weeklyPay - value determines how much ir affects income tax
     */
    public double getIncomeTax(double weeklyPay){
        double incomeTax=0;
        if(weeklyPay>500){
            incomeTax=weeklyPay*0.2;
        }
        else if(weeklyPay>400 && weeklyPay<=500){
            incomeTax=weeklyPay*0.15;
        }
                else if(weeklyPay>300 && weeklyPay<=400){
            incomeTax=weeklyPay*0.12;
        }
                else if(weeklyPay<=300 && weeklyPay>=0){
            incomeTax=weeklyPay*0.1;
        }
        
        return incomeTax;
    }
    
    public double getOverTax(double weeklyPay){
        double incomeTax=weeklyPay*0.25;
        
        return incomeTax;
    }

    
    /**
     * Caculates net pay using the information given
     */
    public double getNetPay(double incomeTax, double regPay){
           double netPay=regPay-incomeTax;
           return netPay;      
    }
    
    /**
     * 
     */
    public String getName(){    
        return firstName + " " + lastName;
    }
}
