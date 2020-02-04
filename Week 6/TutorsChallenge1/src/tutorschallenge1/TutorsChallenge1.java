/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorschallenge1;

/**
 *
 * @author Afsar Ahmed
 */
import java.util.Scanner;
public class TutorsChallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateOfBirth;
        String[] theDate = new String[3];
        System.out.println("Enter date in YYYYMMDD:");
        dateOfBirth = sc.nextLine();
        int x=0;
        //for(int x=0;x<theDate.length;x++){
            switch(x){
                case 0:theDate[2]=dateOfBirth.substring(0, 5); break;
                case 1: break;
                case 2: break;
            }
            System.out.println(theDate[2]);

        //}
    }
    
}
