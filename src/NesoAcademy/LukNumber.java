package NesoAcademy;

import java.util.Scanner;

public class LukNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a four digits number: ");
        int n=s.nextInt();
        int fourthDigit=n%10;
        int thirdDigit=(n/10)%10;
        int seconDigits=(n/100)% 10;
        int firstDigits=(n/1000)%10;
        if (firstDigits+seconDigits==thirdDigit+fourthDigit)
            System.out.println("Lucky");
        else
            System.out.println("not Lucky number");

    }
}
