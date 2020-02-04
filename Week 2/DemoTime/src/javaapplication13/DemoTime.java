/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day =1; //Sunday is 0, Monday is 1
        int days = 20;
        int newDay = (day + days)%7;
        System.out.println("The new day is" + newDay);


        int month = 1; //Feburary is 1, Janurary is 0
        int months = 200;
        int newMonth = month +(months%12);
        //int newMonth = (month +months)%12;
        System.out.println("The new month is :" + newMonth);
        
        int seconds = 320;
        int minutes = seconds/320;
        int rSec = seconds%320;
        
        System.out.println(minutes + " " + rSec);
    }
    
}
