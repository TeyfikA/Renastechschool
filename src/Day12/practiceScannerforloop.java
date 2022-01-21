package Day12;

import java.util.Scanner;

public class practiceScannerforloop {


    public static void main(String[] args) {
        System.out.println("Press anything");
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();

        for (int k = 0; k < name.length(); k++ ) {
            System.out.println(name.charAt(k));


        }
        System.out.println(name.length());

    }
}