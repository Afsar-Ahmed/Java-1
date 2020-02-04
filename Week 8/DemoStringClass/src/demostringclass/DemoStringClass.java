/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostringclass;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoStringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1, s2;
       int x = 0;
       
       Scanner sc = new Scanner (System.in);
        s1=sc.next();
        s2=sc.nextLine();
        char[] letters = new char[s2.length()];
        while(x<s2.length()){
            letters[x]=s2.charAt(x);
            System.out.println(letters[x]);
            x++;
        }
        
        if(s1.equals(s2))
                System.out.println("Same Exact Characters");
        else if (s1.equalsIgnoreCase(s2))
            System.out.println("Same Letters");
        else
            System.out.println("Different Letters");

        // TODO code application logic here
        
    }
    
}
