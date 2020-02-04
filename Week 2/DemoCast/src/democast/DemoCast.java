/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democast;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoCast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=10;
        int num2 = 20;
        double total = num1+num2;
            System.out.println(total);
            
        double number = 5.6;
        int sum=(int)number;
            System.out.println(sum);
        
        int iQuotient=num1/num2;
            System.out.println(iQuotient);
            
        double dQuotient=num1/num2;
            System.out.println(dQuotient);
            
        double cQuotient=(double)num1/num2;
            System.out.println(cQuotient);
        
    }
    
}
