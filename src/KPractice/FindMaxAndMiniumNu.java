package KPractice;

import java.util.Scanner;

public class FindMaxAndMiniumNu {
    public static void main(String[] args) {
        Scanner ta= new Scanner(System.in);
        System.out.println("Enter two numbers to find max and min");
        int num1= ta.nextInt();
        int num2=ta.nextInt();
        int max=num1>num2? num1:num2;
        int min=num1<num2? num1:num2;
        System.out.println("max number is " +max);
        System.out.println("min number is " + min);
    }
}
