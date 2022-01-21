package Class11;

import java.util.Scanner;

public class C1Revision {
   /* Enter a number from the user and print the numbers
   from 0 to that entered number
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num= scan.nextInt();
        for(int i=0; i<=num; i+=2)
            System.out.println(i+ " ");

    }
}
