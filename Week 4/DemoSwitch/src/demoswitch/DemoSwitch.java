/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswitch;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class DemoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int day = sc.nextInt();
       switch(day){
           case 0:System.out.println("Sunday");  break; //break; exsists the switch condition back into the main method
           case 1:System.out.println("Monday");  break;
           case 2:System.out.println("Tuesday"); break;
           case 3:System.out.println("Wednesday"); break;
           case 4:System.out.println("Thursday"); break;
           case 5:System.out.println("Sunday"); break;
           case 6:System.out.println("Saturday"); break; 
           default:System.out.println("idk");
       }
       
       /*switch(day){
           case 0:
           case 6:System.out.println("Weekend");break;
           case 1: 
           case 2:
           case 3:
           case 4:
           case 5:System.out.println("Weekday");
       }*/
        if (day==0 && day==6) {
            System.out.println("Weekend");
        }
        else if (day<=5 && day>=1)
            System.out.println("Weekday");
        
        System.out.println((day==0 || day==6)? "Weekend":"Weekday");
       
    }
    
}
