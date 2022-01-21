package SelfTraining;

import java.util.Scanner;

public class SelftrainingSwitsccaseMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****Calculater");
        char ch;
        do {
            System.out.println("Neter 2 Numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            System.out.println("1.Add\n" +
                    "2.Sub\n" +
                    "3Mult\n" +
                    "4Divi\n" +
                    "5Mod");
            System.out.println("Choose an option from above");
            byte option = scan.nextByte();
            ch=scan.next().charAt(0);
            switch (option) {
                case 1:

            }

        } while (ch == 'y' || ch == 'Y');
    }
}
