package NesoAcademy;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        if(n>10)
            System.out.println(">10");
        else if(n==10)

       System.out.println("10");
        else System.out.println("<10");

    }
}
