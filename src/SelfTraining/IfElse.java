package SelfTraining;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("enter number 1 and number 2 to get the result: ");
        Scanner ta= new Scanner (System.in);
        double n1= ta.nextDouble();
        char op=ta.next().charAt(0);
        double n2= ta.nextDouble();
        if(op=='+')
            System.out.println(n1 + n2);
        else if (op=='-')
            System.out.println(n1-n2);
        else if(op=='*')
            System.out.println(n1*n2);
        else if(op=='/')
            System.out.println(n1/n2);
        else
            System.out.println("number is not valid");
    }

}
