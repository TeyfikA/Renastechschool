package Day13;

import java.util.Scanner;

public class C5ScannerDemo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value to be checked");
        if(scan.hasNextDouble()){
            System.out.println("You have entered a valid double value");
            System.out.println("Scanning the entered value and putting it in a variable");
            double d= scan.nextDouble();


        }
    }
}
