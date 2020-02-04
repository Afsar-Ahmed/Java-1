/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democonstructor;

/**
 *
 * @author Afsar Ahmed
 */
public class Supervisor {
  private int number=100;

    public Supervisor() {
    }

  
    public Supervisor(int n) {
        number =n;
    }

  
    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        number = num;
    }
  
}
