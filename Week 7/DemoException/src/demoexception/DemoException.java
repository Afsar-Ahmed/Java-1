/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoexception;
import java.util.Scanner;
/**
 *
 * @author Afsar Ahmed
 */
public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                  int num; 

        try{
            num=sc.nextInt();  
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("Type in integer");
            System.out.println(e);
        }
        finally{
            System.out.println("Program Ended");
        }
        // TODO code application logic here
    }
    
}
