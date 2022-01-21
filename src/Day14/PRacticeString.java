package Day14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PRacticeString {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scn.nextLine();
        System.out.println("Enter the character to find index for:");
        char ch= scn.next().charAt(0);
        int index1=str.charAt(1);
        if(str.indexOf(ch)==-1)
            System.out.println("chracter" +ch+"is not there!");
        else
            System.out.println("Index of "+ch+ "'is"+ str.indexOf(ch));
    }
}
