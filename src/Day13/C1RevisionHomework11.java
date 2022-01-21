package Day13;

import java.util.Scanner;

public class C1RevisionHomework11 {
    public static void main(String[] args) {
    /*11) WAP to enter marks in 5 subjects out of 100.
        If marks in any subject is less than 33 then it's a faliure. Your program should output the no. of subjects the person is failing in else it should print PASS.
	50
	60
	98
	58
	81 (edited)
    */
        float english, maths, science, history, computers;
        Scanner scan = new Scanner(System.in);
        char option;
        {
            do {
                System.out.println("Enter Marks out of 100 for the following subjects");
                System.out.print("English: ");
                english = scan.nextFloat();
                System.out.print("Maths: ");
                maths = scan.nextFloat();
                System.out.print("Science: ");
                science = scan.nextFloat();
                System.out.print("History: ");
                history = scan.nextFloat();
                System.out.print("Computers: ");
                computers = scan.nextFloat();

                byte count = 0;
                if (english < 33) count++;
                if (maths < 33) count++;
                if (science < 33) count++;
                if (history < 33) count++;
                if (computers < 33) count++;
                if (count >= 1) {
                    System.out.println("The student is failing in " + count + "subject");
                } else
                    System.out.println("Pass");
                System.out.println("Press y to continue or any other key tio stop!");
                option = scan.next().charAt(0);
            } while (option == 'y');
            System.out.println("Thanks for using!");

        }
    }
}