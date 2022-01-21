package StudyHall;

import java.util.Scanner;

public class StringDemoScanner {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println("Enter the character to find index for: ");
        char ch=scn.next(). charAt(0);
        for (int cnt = 0;  cnt<str.length();  cnt++) {
            if(ch == str.charAt(cnt)){
                 System.out.println("Teyfik " + cnt);
                break;
            }
        }


    }
}
