/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoElseif;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;

public class DemoElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1, d2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type in a double");
        d1 = sc.nextDouble();

        System.out.print("Type in another double");
        d2 = sc.nextDouble();

        if (d1 > d2) {
            System.out.println(d1 + " is greater than " + d2);
        } else if (d2==d1) {
            System.out.println(d1 + " is equal to " + d2);

        } else {
            System.out.println(d1 + " is less than " + d2);
        }
        
        if(d1>d2){
            System.out.println(d1 + " is greater than " + d2);
        }
        if(d2==d1){
            System.out.println(d1 + " is equal to " + d2);
        }
        if(d1<d2){
            System.out.println(d1 + " is less than " + d2);
        }

    }

}
