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
public class Worker {
    private int hours = 40;
    private double rate = 15;
    private double pay = 600;

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        hours = h;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double r) {
        rate = r;
    }

    public double getPay() {
        calculatePay();
        return pay;
    }
    private void calculatePay(){
        pay= hours*rate;
        
    }

}
