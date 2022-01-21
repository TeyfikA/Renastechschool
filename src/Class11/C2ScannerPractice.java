package Class11;

import java.util.Scanner;

public class C2ScannerPractice {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a double number");
        double a= scn.nextDouble();
        Scanner tr= new Scanner(System.in);
        double b= tr.nextDouble();
        System.out.println("Enter double");
        double sub= a-b;
        double mul= a*b;
        double div= a/b;
        double mod=a%b;
        double add=a+b;
        System.out.println(sub+  "\n" +mul+ "\n" +div+ "\n"+ mod+ "\n"+ add );


    }
}
