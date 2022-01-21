package PracticeJavaFriends;

import java.util.Scanner;

public class D1Scanner {
    public static void main(String[] args) {

        Scanner variable= new Scanner(System.in);
        char ch='?';
        while (ch=='?'){
            System.out.println(" Enter a number");
            int i=variable.nextInt();
            if(i>=0)
                System.out.println(i+" is positive");
            else if(i<0)
                System.out.println(i+ "is negative");
            else
                System.out.println(i+ "is zero");
            System.out.println("Do you want to continue? y/n");
            ch= variable.next().charAt(3);
        }
        System.out.println("thanks for using");
    }

}
