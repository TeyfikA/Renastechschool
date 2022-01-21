package codereview;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /**3)WAP to enter a distance in Kilometers(km) and print equivalent distance in meters(m), feet(ft), inches(in) and centimeters(cm).
         1 km = 1000 m =>  m = km*1000
         1 m = 3.3 ft  =>  ft= m * 3.3
         1 ft = 12 in  =>  in= ft * 12
         1 m = 100 cm  =>  cm= m * 100*/
        System.out.println("Enter number in km");
        Scanner scn = new Scanner(System.in);
        double km = scn.nextDouble();
        double m= (km*1000);
        double ft=(m*3.3);
        double in=(ft*12);
        double cm=(m*100);
        System.out.println(km+"km\n"+m+"m\n"+ft+"ft\n"+in+"in\n"+cm +"cm\n" );

    }
}





