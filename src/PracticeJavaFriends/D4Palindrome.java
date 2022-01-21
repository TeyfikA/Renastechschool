package PracticeJavaFriends;

import java.util.Scanner;

public class D4Palindrome {
    public static void main(String[] args) {
        int num, copy, reserve=0, lastd;
        System.out.println("Enter a number");
        Scanner scn= new Scanner(System.in);
        num=scn.nextInt();
        copy=num;

        while (num>0) {
            System.out.println("A Interation");

            lastd = num % 10;
            reserve = (reserve * 10) + lastd;
            System.out.println(" Reserve "+ reserve);
            num = num / 10;
        }
        if (copy==reserve)
            System.out.println("Palindrome Number");
            else System.out.println("Not Palindrome Number");

        }


        }




