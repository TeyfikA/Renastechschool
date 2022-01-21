package SelfTraining;

import java.util.Scanner;

public class ScannerNameAge {
    public static void main(String[] args) {
        Scanner ta= new Scanner(System.in);
        System.out.println("enter your name and age:  " );
        System.out.println(ta.nextLine() + "! you are "+ ta.nextDouble()+ " years old!");

    }
}
