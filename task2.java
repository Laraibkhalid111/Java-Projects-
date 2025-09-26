
package javaproject;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int num1,num2;
        System.out.println("enter 1st num");
         num1= sc.nextInt();
        System.out.println("enter 2nd num");
         num2= sc.nextInt();
        int sum=num1+num2;
        System.out.println("num1+num2= "+sum+".");
       int diff=num1-num2;
          System.out.println("num1-num2="+diff+".");
          int mult=num1*num2;
            System.out.println("num1*num2="+mult+".");
            int div=num1/num2;
              System.out.println("num1/num2="+div+".");
    }
    
}
