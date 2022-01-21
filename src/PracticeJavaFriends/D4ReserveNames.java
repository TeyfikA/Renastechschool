package PracticeJavaFriends;

import java.util.Scanner;

public class D4ReserveNames {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Full Name");
       String j=scn.nextLine();
        System.out.println("Full name"+ j);
        for(int i=j.length()-1; i>=0; i--){
            System.out.println(j.charAt(0));
        }
        System.out.println();
        System.out.println(j.length());
    }
}