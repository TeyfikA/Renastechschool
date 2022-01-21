package NesoAcademy;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        if((s.nextInt()%2)==0)
            System.out.println("even");
        else
            System.out.println("Odd");
        System.out.println("Outside the if statement");
    }
}
