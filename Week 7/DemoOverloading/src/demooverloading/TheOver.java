/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demooverloading;

/**
 *
 * @author Afsar Ahmed
 */
public class TheOver {
    private int num = 5;
    private double digit=5;

    public int getNum() {
        return this.num;
    }

    public double getDigit() {
        return this.digit;
    }
    public void process(int num){
        this.num+=num;
    }
    public void process(double digit){
        this.digit+=digit;
    
    }
    
        public void process(double digit,int num){
        this.digit+=digit;
        this.num+=num;
    }
        
                public void process(int num,double digit){
        this.digit+=digit;
        this.num+=num;
    }
    
}
