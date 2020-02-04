/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovariables;

/**
 *
 * @author Afsar Ahmed
 */
public class Demo_Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=18;
        System.out.println("Variables Example");
        System.out.println("num is: " + num);
        num = 3;
        System.out.println("num is: " + num);
        
        double s = 5.5;
        System.out.println(s);
        char letter = 'x';
        System.out.println(letter);
        
        boolean isB = true;
        System.out.println(isB);
        
        final int RATE = 20;
        System.out.println(RATE);
        
        //RATE = 10; cannot change a finak variable at runtime
    }
    
}
