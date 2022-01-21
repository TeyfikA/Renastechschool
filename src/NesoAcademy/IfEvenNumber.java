package NesoAcademy;

import java.util.Scanner;

public class IfEvenNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s=new Scanner (System.in);
        int n= s.nextInt();
        if(n%2==0)
            System.out.println("even");
        if(!(n%2==1))
            System.out.println("odd");

    }
}
