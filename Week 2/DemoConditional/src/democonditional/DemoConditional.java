/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democonditional;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoConditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double number;
       int digit;
       
        System.out.println("Type double: ");
        number=sc.nextDouble();
        
        if(number<100){
            System.out.println(number);
        }
        if(number>=0)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");
        
        digit=sc.nextInt();
        
        if(digit==55){
            System.out.println("digit is " + digit);
            System.out.println("digit is two 5s");
        }
        
        if(digit%2==0){
            System.out.println("digit is even");
        }
        else
            System.out.println("digit is odd");
    }
    
}
