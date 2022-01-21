package SelfTraining;

import java.util.Scanner;

public class Training {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        if (N % 2 == 0 && (N >= 6 && N <= 20 || N > 20 || N < 6)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");

        }
    }
}










