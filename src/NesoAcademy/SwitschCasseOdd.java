package NesoAcademy;

import java.util.Scanner;

public class SwitschCasseOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        switch (n%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("Odd");
        }
    }
}
