/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democonstructor;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //only works if there is a default or an empty constructor
        Supervisor one = new Supervisor();
        
        Supervisor two = new Supervisor(200);
        System.out.println(one.getNumber());
        one.setNumber(101);
        System.out.println(one.getNumber());

        System.out.println(two.getNumber());
    }
    
}
