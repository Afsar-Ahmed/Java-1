/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparameter;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TheParameter one;
        one = new TheParameter();
        // constructor builds an object
        
        System.out.println(one.getNumber());
        System.out.println(one.process(10));
        one.change(10);
        System.out.println(one.getNumber());
        System.out.println(one.testNumber(100));
        System.out.println(one.changeNumber(50));

    }
    
}
