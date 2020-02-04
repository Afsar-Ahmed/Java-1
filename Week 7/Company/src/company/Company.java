/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Afsar Ahmed
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker one = new Worker();
        System.out.println(one.getHours());
        System.out.println(one.getRate());
        System.out.println(one.getPay());

        one.setHours(25);
        one.setRate(30);
        System.out.println(one.getHours());
        System.out.println(one.getRate());
        System.out.println(one.getPay());
        // TODO code application logic here
    }
    
}
