package StudyHall;

import java.util.Scanner;

public class FindTheLetterE{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
            System.out.println("Please write in a String : ");
            String name = scn.next();
            for (int i = 0; i < name.length(); i++) {
                if ('e' == name.charAt(i)) {
                    System.out.println(" The word has e and it's index : " + (i));
                }
            }
        }
    }





