/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbookexcersies;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class TextBookExcersies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=1;
       int y=9;
        
        System.out.println((x>y)?"booyah":"ye");//if statements just got simplified, it only works for boolean though
        //question 3.10
        Scanner sc = new Scanner (System.in);
        double score;
        score=sc.nextDouble();
        
       //Debug this 
       if (score >= 60.0)  //Anything greater than or equal to 60 is a D so all the other condtions will nvr pass
           System.out.println("D"); 
       else if (score >= 70.0)  
           System.out.println("C"); 
       else if (score >= 80.0)  
           System.out.println("B"); 
       else if (score >= 90.0)  
           System.out.println("A"); 
       else  
           System.out.println("F");
        
       //3.13
       
       
        
    }
    
}
