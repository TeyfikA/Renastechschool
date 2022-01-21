package Day12;

import java.util.Scanner;

public class C3EvenODDScanner {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Even odd check");
        char ch='y';
        while(ch=='y'){
            System.out.println("Enter a number");
            int i= scn.nextInt();
            if(i%2==0) System.out.println(i+" is even");
            else System.out.println(i+ "is odd");
            System.out.println("Enter y to continue or any other key to stop");
            ch= scn.next().charAt(0);
        }
    }
}
