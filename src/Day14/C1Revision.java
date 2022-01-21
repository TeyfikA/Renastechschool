package Day14;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {
        //Scanner: a referenced data type as it is a class
        // scan: a reference variable
        Scanner scan= new Scanner(System.in);
        // using the object reference of the Scanner class,
        //in built methods of
        System.out.println("Enter a number");
        while(!scan.hasNextInt())
            System.out.println("Please enter a valid int number");
        scan.nextLine();
        if(scan.hasNextInt()) {
            int value = scan.nextInt();
            System.out.println("Is a Int number40");
        }
            else{
                System.out.println("No entered is not a valid int");
            }
        scan.nextInt();

    }
}
