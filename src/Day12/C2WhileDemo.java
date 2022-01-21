package Day12;

import java.util.Scanner;

public class C2WhileDemo {
    /*WAP which enters a number from the user and prints it until
    -1 is entered.

    Output
    -----
    6
    6 is entered
     */
    public static void main(String[] args) {
        System.out.println("Printing numbers");
        Scanner scn = new Scanner(System.in);
        int k = 1;


        while (true) {
            k = scn.nextInt();
            if (k == -1) {
                System.out.println("Good Bye");
                break;
            }
                    System.out.println(k+" is entered");

                }
            }
        }

