/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demosentinel;
import java.util.Scanner;
/**
 *
 * @author Afsar Ahmed
 */
public class DemoSentinel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int newNum=0;
        
        do{
           num=num+newNum;
            System.out.println("Enter a value or enter -1 to exit");
            newNum=sc.nextInt();
        }
        //loop will keep running until the user enters -1
        while(newNum!=-1);//exits loop
        System.out.println(num);
    }
    
}
