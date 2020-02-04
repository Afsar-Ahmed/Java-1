/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomethod;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker one = new Worker();
        Worker two = new Worker();
        System.out.println(one.hoursWorked);
        System.out.println(one.hourlyWage);
        System.out.println(one.weeklyPay);
        one.hourlyWage=20;
        //int newWeeklyPay=one.calculatePay();
        //System.out.println(newWeeklyPay);
        one.calculatePay();
        System.out.println(one.weeklyPay);
        one.addHours();
        one.calculatePay();
        System.out.println(one.weeklyPay);
        System.out.println(two.weeklyPay);
    }
    
}
