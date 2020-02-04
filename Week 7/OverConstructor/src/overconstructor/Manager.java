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
public class Manager {
    private int number=100;
    private double wage=50;
    
    public Manager(){
        this.number=2147483647;
    }
    public Manager(int number){
        this.number=number;
    }
    public Manager(double wage){
        this.wage=wage;
    }
    public Manager(double wage,int number){
        this.wage=wage;
        this.number=number;
    }
        
    public int getNumber(){
         return this.number;
    }
    
    public double getWage(){
        return this.wage;
    }
}
