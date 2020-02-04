/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoscanner;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number=2;
        System.out.print("user input");
        System.out.println(number++);
    }
    
}
