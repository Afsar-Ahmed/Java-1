/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overconstructor;

/**
 *
 * @author Afsar Ahmed
 */
public class OverConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager one = new Manager();
        System.out.println(one.getNumber());
        System.out.println(one.getWage());
        
        
        Manager two = new Manager(90);
        System.out.println(two.getWage());
        System.out.println(two.getNumber());
        
        Manager three = new Manager(20.65);
        System.out.println(three.getWage());
        System.out.println(three.getNumber());
        
        Manager four = new Manager(20.65,75);
        System.out.println(four.getWage());
        System.out.println(four.getNumber());
    }
    
}
