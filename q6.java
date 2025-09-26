package javalabtask;

import java.util.Scanner;
 public class q6 {
    static Scanner x=new Scanner(System.in);
     public static double EnterBill(double billamount  ){
        double  a= billamount;
     return a;
 }
     public static void SplitBill(double a, int b){
         double  AmountPerPerson= a/b;
         System.out.println("Amount Per Person ="+AmountPerPerson);
     }

    public static void main(String[] args) {
        System.out.println("Enter resturant bill: ");
        double  bill=x.nextInt();
        System.out.println("Enter Total number of people: ");
        int people =x.nextInt();
       double  b= EnterBill(bill);
        System.out.println("Confirmed Total Bill="+b);
        SplitBill(bill,people);
    }
    
}
