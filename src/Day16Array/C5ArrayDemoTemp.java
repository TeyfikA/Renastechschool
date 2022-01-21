package Day16Array;

import java.util.Scanner;

public class C5ArrayDemoTemp {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        float temp[]= new float[10];
        /*System.out.println("Enter temperature of temp");
        temp[0]= scan.nextFloat();*/
        System.out.println("Entered temperatures of 10 cities:");
        for(int i=0; i<temp.length; i++){
            temp[i] = scan.nextFloat();

        }
        System.out.println("\n Entered temperatures are:");
        for(int i=0; i<temp.length; i++)
            System.out.println(temp[i]);

    }
}
