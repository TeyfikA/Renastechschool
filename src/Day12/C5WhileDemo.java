package Day12;

import java.util.Scanner;

public class C5WhileDemo {
    public static void main(String[] args) {
        char ch='y'; int num;
        Scanner scan= new Scanner(System.in);
        while(ch=='y'){
        System.out.println("Enter a Number");
        num=scan.nextInt();
        if(num>0) System.out.println("number is positive");
        else if(num<0) System.out.println("number is negative");
        else System.out.println("Number is zero");
            System.out.println("Do you want to continue?y/n");
           ch=scan.next().charAt(0);

        }
        System.out.println("Thanks for using!!!:");
    }
}

