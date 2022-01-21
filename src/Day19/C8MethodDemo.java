package Day19;

import java.util.Scanner;

public class C8MethodDemo {
    public static void main(String[] args) {
        Scanner ta= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        System.out.println(
                add(ta.nextInt(),ta.nextInt())
        );
    }
    static int add(int a, int b){
        return a+b;
    }
    static double subtract(double a, double b){
        return a-b;
    }
}
