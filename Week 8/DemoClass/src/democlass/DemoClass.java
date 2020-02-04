/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee one = new Employee();
       Employee two = new Employee();
       Employee[] h = new Employee[6];
        System.out.println(one.one);
        System.out.println(two.one);
        System.out.println(h.length);
        one.one=2;
        System.out.println(one.one);
    }
    
}
