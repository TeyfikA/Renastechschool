package PracticeJavaFriends;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Add a number for odd or even");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        if(num%2==0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
