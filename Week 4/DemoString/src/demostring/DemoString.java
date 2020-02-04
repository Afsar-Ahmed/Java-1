/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.*;
import java.text.DecimalFormat;
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double digit = 0;
        digit=g.nextDouble();
        System.out.println(df.format(digit));
    }
    
}
