package StudyHall;

import java.util.Scanner;

public class Homework2IMPORTANT {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char option;
        {
            System.out.println("Please write a String");
            {
                String name = scn.nextLine();
                int lower_case = 0, upper_case = 0, digits = 0, sp_char = 0, spaces = 0;
                for (int j = 0; j < name.length(); j++) {
                    char ch = name.charAt(j);
                    if (ch > 47 && ch <= 57) {
                        digits++;
                    } else if (ch >= 97 && ch <= 122) {
                        lower_case++;
                    } else if (ch >= 65 && ch <= 90) {
                        upper_case++;
                    } else if (ch == 32) {
                        spaces++;
                    } else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) ||
                            (ch >= 123 && ch <= 126)) sp_char++;
                }
                System.out.println("Digit count: " + digits);
                System.out.println("Lower case count: " + lower_case);
                System.out.println("Upper case count: " + upper_case);
                System.out.println("Spaces count: " + spaces);
                System.out.println("Special  character: " + sp_char);
                System.out.println("Press y to continue or any other key to stop!");
                option = scn.next().charAt(0);


            }
            while (option == 'y') {


                System.out.println("Thanks for using!");

            }
            System.out.println();
        }

    }
}