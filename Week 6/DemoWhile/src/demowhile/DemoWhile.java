/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demowhile;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        while(x<5){
            System.out.print(x + "\t");
            x++;

        }
        System.out.println();
        int count=2;
        while(count<=6){
            System.out.print(count + "\t");
            count++;
        }// TODO code application logic here
        System.out.println();
        count=5;
        
        while(count>0){
            System.out.print(count + "\t");
            count--;
        }
        System.out.println();
        
                count=0;
        
        while(count<=4){
            if(count!=3){
            System.out.print(count + "\t");
            
            }
            count++;
        }
        System.out.println();
        count=1;
        while(count<=9){
            if(count<=3 || count>=7){
                System.out.print(count + "\t");
            }
            count++;
            
        }
    }
    
}
