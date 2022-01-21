package Class11;

import java.util.Scanner;

public class C3ScannerDemo {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a byte number");
        byte b= scn.nextByte();
        System.out.println(b);
        System.out.println("Enter a long number");
        long l= scn.nextLong();
        System.out.println("there ist the long number"+l);
        System.out.println("Enter a double number");
        double d= scn.nextDouble();
        float f= scn.nextFloat();
        System.out.println("Double and float"+d+ "\t"+f );

    }
}
