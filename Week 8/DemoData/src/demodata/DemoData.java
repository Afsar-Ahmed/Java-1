/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodata;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Type a number");
        num=sc.nextInt();
       /*do{
           System.out.println("Type a number");
           num=sc.nextInt();

       }
        while(num<0);
        System.out.println(num);*/

        while(num<0){
            System.out.println("Please try again");
            num=sc.nextInt();
        }// TODO code application logic here
        System.out.println(num);
        
    }
    
}
