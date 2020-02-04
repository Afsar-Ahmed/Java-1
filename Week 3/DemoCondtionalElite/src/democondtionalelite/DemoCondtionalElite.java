/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democondtionalelite;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoCondtionalElite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int highestValue=(x>y)? x:y;
        int num=(x>y)?50:100;//Tells if its true or false, if true then the first arguement (from left to righT) is valued
        System.out.println(num);// TODO code application logic here
        System.out.println((x%2==0)? "even":"odd");
        System.out.println((x>=0? "positive":"negative"));
        System.out.println((y%3==0)? "y is divisible by 3":"y is not divisible by 3");       
        System.out.println(highestValue);
        System.out.print("age: ");
        double age=sc.nextDouble();
        int tp=(age<=12)?10:15;
        System.out.println(tp);
    }
    
}
