/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democompare;

/**
 *
 * @author Afsar Ahmed
 */
public class DemoCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=3;
        int y=5;

        boolean answer=x>y;
        System.out.println(answer);// TODO code application logic here
        
        boolean isGreater=(x*y)>(x+y);
        System.out.println(isGreater);
        
        System.out.println(4>8);
        System.out.println(x==y);
        
        boolean isTrue=true;
        boolean isFalse=false;
        boolean isAnd=isFalse && isTrue;
        
        System.out.println(isAnd);
        
        boolean isOr=isFalse || isTrue;
        
        System.out.println(isOr);
        
        boolean isLong=((3<7) && (4>7)||(4>7));
        System.out.println(isLong);
    }
    
}
