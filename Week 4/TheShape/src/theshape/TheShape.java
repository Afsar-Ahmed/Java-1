package theshape;
/**
Afsar Ahmed
* 991432327
Assignment 2
2017-09-29
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class TheShape{
    public static void main(String args[]){
        int num1=20;
        int num2=10;
        
        double anwser = num2/num1;
        System.out.println(anwser);
	Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
		
	int num; //this variable declares the option
	double base,height; 
        //these variables store the dimensions of a triangle
	double length,width; 
        //these varaibles store the dimensions of a rectangle
        double areaR,areaT; 
        //these variables store the calculated values based on th user's input
System.out.print("Enter 1 for triangle or any other integer for rectangle: ");
	num=sc.nextInt();
	
	if(num == 1){
           System.out.println("Enter tringle base: ");
           base=sc.nextDouble();
           

           if(base<0)
              System.out.println("Base cannot be negative.");
             
           else{
               System.out.println("Enter triangle height: ");
               height=sc.nextDouble();
               if(height<0)
                System.out.println("Height cannot be negative.");
               else{
                areaT=.5*height*base;
                System.out.println("Triangle area is " + df.format(areaT));
               }
           }
	}

	else{
            System.out.println("Enter rectangle length: ");
            length=sc.nextDouble();
            

            if(length<0)
                System.out.println("length cannot be negative.");
            
            else{
                System.out.println("Enter rectangle width: ");
                width=sc.nextDouble();
                if(width<0)
		System.out.println("Width cannot be negative.");
                else{
                 areaR=length*width;
           System.out.println("Rectangle area is " + df.format(areaR));
                }
            }
          }
    }
}