package StudyHall;

import java.util.Scanner;

public class HOMEWORK {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int cS = 0;
        int countUpper = 0;
        int countLower = 0;
        int countSpecial = 0;
        int countNumber = 0;
        boolean isContunue = true;
        char checking;

        while (isContunue) {

            System.out.println("Please write in a String : ");
            String name = scn.nextLine();


            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) > 64 && name.charAt(j) < 91) {
                    countUpper++;
                } else if (name.charAt(j) > 96 && name.charAt(j) < 123) {
                    countLower++;
                } else if (name.charAt(j) > 47 && name.charAt(j) < 58) {
                    countNumber++;
                } else if (name.charAt(j) == 32) cS++;
                else {
                    countSpecial++;
                }
            }
            System.out.println("Number of word is :" + countNumber);
            System.out.println("Upper of word is :" + countUpper);
            System.out.println("Lower of word is :" + countLower);
            System.out.println("Special of word is :" + countSpecial);
            System.out.println("Space of word is " + cS);
            System.out.println("Do u want to continue : 'y' or ..");
            checking = scn.next().charAt(0);
            scn.nextLine();
            if (checking == 'y') {
                isContunue = true;
                cS = 0;
                countUpper = 0;
                countLower = 0;
                countSpecial = 0;
                countNumber = 0;

            } else isContunue = false;


        }


    }

}
