/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoloop;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("For loop");
        for(int x=0;x<=5;x++){

            System.out.print(x + "\t");   
        }
        System.out.println("While loop");
        int value=0;
        while(value<6){
            System.out.print(value + "\t");
            value++;
            
        }
        System.out.println(value);
        
        System.out.println("Do While Loop");
        value=0;
        do{
            System.out.print(value + "\t");
        value++;
        
        }
        while(value<6);
        System.out.println(value);
        
       System.out.println("For loop2");
        for(int x=10;x<=5;x++){

            System.out.print(x + "\t");   
        }
                System.out.println("While loop");
        value=0;
        while(value<6){
            System.out.print(value + "\t");
            value++;
            
        }
        System.out.println(value);
        
        System.out.println("Do While Loop");
        value=0;
        do{
            System.out.print(value + "\t");
        value++;
        
        }
        while(value<=6);
        }
    
}
