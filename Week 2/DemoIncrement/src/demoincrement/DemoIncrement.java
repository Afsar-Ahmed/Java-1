/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoincrement;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoIncrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=1;
       int y=x++;

        System.out.println(x);
        System.out.println(y);// TODO code application logic here
        
       int a=1;
       int b=--a;
       
        System.out.println(a);
        System.out.println(b);
        
       int m=1;
        System.out.println(m++);
        System.out.println(m);
        
       int t = 1;
        System.out.println(--t);
        System.out.println(t);
        
       double d=1;
        System.out.println(++d);
               
    }
    
}
