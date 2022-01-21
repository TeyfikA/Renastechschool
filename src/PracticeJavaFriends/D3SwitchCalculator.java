package PracticeJavaFriends;

import java.util.Scanner;

public class D3SwitchCalculator {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double a, b;
        char ch='y';
        while(ch=='y'){

        System.out.println("Enter 2 Dauble Number");

        System.out.println("Give an option \n 1 for addition \n 2 for subraction \n 3 for multiplication\n" +
                "4 for division\n 5 for modulus");


        a= scn.nextDouble();
        b= scn.nextDouble();
        System.out.println("Numbers are a="+a+ "\tb="+b);

        int option;
        option= scn.nextInt();


        switch (option) {
            case 1:
                System.out.println("this is case1");
                System.out.println("a-b" + (a + b));
                break;
            case 2:
                System.out.println("this is case 2");
                System.out.println("a-b" + (a - b));
                break;
            case 3:
                System.out.println("this is case 3");
                System.out.println("a*b" + (a * b));
                break;
            case 4:
                System.out.println("this is case 4");
                System.out.println("a/b" + (a / b));
                break;
            case 5:
                System.out.println("this is case 5");
                System.out.println("a%b" + (a % b));
                break;
            default:
                System.out.println("invalid entry");
        }

                System.out.println("Do you want to continue? y/n");
                ch= scn.next().charAt(0);

            }
            System.out.println("Bu ne lennnn");
    }
    }

