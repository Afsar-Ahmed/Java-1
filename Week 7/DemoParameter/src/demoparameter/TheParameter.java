/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparameter;

/**
 *
 * @author Afsar Ahmed
 */
public class TheParameter {
    private int number=5;
    
    public int getNumber(){
        return number;
    }
    public int process(int num){
    //num is a local variable to the method
        number=num+number;
      return number;  
    }
    
      private void stuff(int num){//wont work cause it is private
        number=num+number;   
    }
      
   public void change(int num){
        num+=1;
        stuff(num);
    }
    public int testNumber(int number){
     return number;   
    
    }
    public int changeNumber(int num){
     number+=num;
     return number;   
    
    }
}
