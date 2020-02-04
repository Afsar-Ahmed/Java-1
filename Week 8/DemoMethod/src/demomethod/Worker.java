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
public class Worker {
    public int hourlyWage=15;
    public int hoursWorked=40;
    public int weeklyPay=600;
    public void calculatePay(){
        weeklyPay=hoursWorked*hourlyWage;
    }
    public void addHours(){
        hoursWorked+=1;
    }
}
