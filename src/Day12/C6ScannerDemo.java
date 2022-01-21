package Day12;

import java.util.Scanner;

public class C6ScannerDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer");
        int i; boolean flag=true;
        while(flag)
        if (scn.hasNextInt()) {
            i = scn.nextInt();
            System.out.println("Entered number is" + i);
            flag= false;
            break;

        }
        System.out.println("Invalid entry! Please enter again");
    }
}
