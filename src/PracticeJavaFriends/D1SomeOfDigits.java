package PracticeJavaFriends;

import java.util.Scanner;

public class D1SomeOfDigits {
    public static void main(String[]arg){
        System.out.println("Enter a number");
        Scanner variable= new Scanner(System.in);
        int n = variable.nextInt();
        int hane1=n/10000;
        int hane2=(n/1000)%10;
        int hane3=(n/100)%10;
        int hane4=(n/10)%10;
        int hane5=n%10;

        System.out.println(hane1+ "\n" + hane2+ "\n" + hane3 + "\n" + hane4+ "\n" + hane5);
        int sum_of_digits= hane1+hane2+hane3+hane4+hane5;
        System.out.println(sum_of_digits);
        System.out.println("Thank you for Entering number");

    }
}
