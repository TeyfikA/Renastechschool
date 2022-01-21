package SelfTraining;


import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner ta= new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10. ");
        int n= ta.nextInt();
        while (n<1 || n>10){
            System.out.println("The entered number is not valid \n enter a new number.");
            n= ta.nextInt();
        }
        System.out.println(n+ " number is valid");
    }











}
