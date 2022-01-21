package Day13;

import java.util.Scanner;

public class C2Palindrome {
    public static void main(String[] args) {
        int num, reserve=0,copy,last_digit;
        System.out.println();
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        copy=num;
        while(num>0)
        {
            //first num=123
            System.out.println("An ITERATION");
            last_digit=num%10;// 1last digits=3  2nd lastdigtis=2 3rd last
            reserve=(reserve*10)+last_digit;//1reserve3 2reserve=32 3reserve=321
            System.out.println("reserve:" +reserve);
            num=num/10;// 2nd num =12 3rdnum= 1

        }
        if(copy==reserve)
            System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }
}
