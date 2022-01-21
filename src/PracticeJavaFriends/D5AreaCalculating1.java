package PracticeJavaFriends;

import java.util.Scanner;

public class D5AreaCalculating1 {
    public static void main(String[] args) {
        System.out.println("********Area Calculator");
        Scanner scn = new Scanner(System.in);
        System.out.println("1. For the area of rectangle\n" +
                "2. Area of a square\n" +
                "3. Area of circle");
        System.out.println("Choose an option number from above'");
        byte option = scn.nextByte();
        switch (option) {
            case 1:
                System.out.println("Enter the length and breadth of the rectangle:");
                double length = scn.nextDouble();
                double breadth = scn.nextDouble();
                System.out.println("Area of the rectangle:" + (length * breadth));
                break;
            case 2:
                System.out.println("Enter the side of a square through user and print its area.");
                double side = scn.nextDouble();
                System.out.println("Area of Square is:" + (side * side));
                break;
            case 3:
                System.out.println("  Enter the radius of a circle through user and print its area");
                double ra = scn.nextDouble();
                System.out.println("Area of Circle is :" + (3.14 * ra * ra));
                break;

        }
    }

}
