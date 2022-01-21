package PracticeJavaFriends;

import java.util.Scanner;

public class D6KmToMetersEtc {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double km, m , ft, inc, cm;
        System.out.println("Enter a Distance in Kilometers ");
        km=scn.nextDouble();
        m=km*1000;
        System.out.println("in metres "+ m);
        ft=m*3.3;
        System.out.println("in Feet " +ft);
        inc=ft*12;
        System.out.println("in Inch " +inc );
        cm=m*100;
        System.out.println(" in centrimeter"+ cm);

    }
}
