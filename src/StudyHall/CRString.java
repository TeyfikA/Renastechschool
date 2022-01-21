package StudyHall;

import java.util.Scanner;

public class CRString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch = 0;
        while (ch == 'y') {
            int cnt = 0;
            String str = scan.nextLine();
            System.out.println(" Enter a Number to find the unicode");
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) > 32 && str.charAt(k) < 128) {
                    cnt++;

                }
            }
            System.out.println("Digits number of word is" + cnt);
        }
    }
}