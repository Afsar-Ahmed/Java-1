/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarray;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers={5,12,3,18};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers.length);
System.out.println(numbers[numbers.length - 1]);// TODO code application logic here
        int x=1;
        while(x<=numbers.length){     
            System.out.println(numbers[numbers.length-x]);
            x++;
        }
        double digits [] = new double[5];
        for(x=0;x<digits.length;x++){
            digits[x]=2*x;
        }
        x=0;
        while(x<digits.length){
            System.out.println(digits[x]);
            x++;
        }
    }
    
}
