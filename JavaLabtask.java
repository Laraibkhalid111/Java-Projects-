
package javalabtask;
import java.util.Scanner;
public class JavaLabtask {

    public static void main(String[] args) {
        
        Scanner x=new Scanner(System.in);
        float quiz ,ass,mid,Final;
        // taking input from user , if  invalid value is entered while loop and 
        //if condition is used to display invalid input , and with continue it will again ask for input, if 
        //valid input is entered then it will break loop and move to next input 
       while (true){ System.out.println("enter your quiz marks out of 15");
         quiz=x.nextFloat();
        if (quiz <0 || quiz > 15){
            System.out.println("invalid input ");
            continue;
        }
        break;
        }
        
        while (true){ System.out.println("enter your Assignment marks out of 10");
         ass=x.nextFloat();
        if (ass <0 || ass > 10){
            System.out.println("invalid input ");
            continue;
        }
        break;
        }
        while (true){ System.out.println("enter your mid marks out of 25");
         mid=x.nextFloat();
        if (mid <0 || mid > 25){
            System.out.println("invalid input ");
            continue;
        }
        break;
        }
        while (true){ System.out.println("enter your Final marks out of 50");
         Final=x.nextFloat();
        if (Final <0 || Final > 50){
            System.out.println("invalid input ");
            continue;
        }
        break;
        }
        // calculating totalmarks with formula 
        float totalmarks;
        totalmarks = quiz+ass+mid+Final;
        System.out.println("Your total marks are :"+totalmarks+".");
        // calculating avage of total marks
        double Average =((totalmarks /100)*100);
        System.out.println("Avg of your marks is "+Average+".");
        // using if else to diplay grade of student 
        if (Average >=85){
            System.out.println("Grade : A");
        }
        else if (Average <=84 && Average >=80){
            System.out.println("Grade : A-");
        }
        else if (Average <=79 && Average >=74){
            System.out.println("Grade : B+");
        }
        else if (Average <=74 && Average >=71){
            System.out.println("Grade : B");
        }
        else if (Average <=70 && Average >=68){
            System.out.println("Grade : B-");
        }
        else if (Average <=64 && Average >=67){
            System.out.println("Grade : C+");
        }
        else if (Average <=63 && Average >=61){
            System.out.println("Grade : C");
        }
        else if (Average <=60 && Average >=58){
            System.out.println("Grade : C-");
        }
        else if (Average <=57 && Average >=54){
            System.out.println("Grade : D+");
        }
        else if (Average <=53 && Average >=50){
            System.out.println("Grade : D");
        }
        else if (Average < 50){
            System.out.println("Grade : F");
        }
        
    }
    
}
 