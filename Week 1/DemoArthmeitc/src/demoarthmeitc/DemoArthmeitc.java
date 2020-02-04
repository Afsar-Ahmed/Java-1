/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarthmeitc;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoArthmeitc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iModulus = 32%5;
        System.out.println(iModulus);

        int iDivide = 32/5;
        System.out.println(iDivide);

        double dDivide = 32/5;
        System.out.println(dDivide);

        double dDivision = 32.0/5;
        System.out.println(dDivision);

        //int iDivision = 32.0/5; must use integers
        
        int sum = 10+10/5;
        System.out.println(sum);
        // TODO code application logic here
    }
    
}
