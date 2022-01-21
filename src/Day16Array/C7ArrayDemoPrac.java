package Day16Array;

import java.util.Scanner;

public class C7ArrayDemoPrac {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the size");
        int size= scn.nextInt();
        int array[]=new int[size];
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println("please write any int number");
            array[i]= scn.nextInt();

        }
        for (int i = 0; i<array.length ; i++) {
            sum+=array[i];

        }
        int average=sum/ array.length;
        System.out.println("average is: "+ average);
        System.out.println("sum is "+sum);

    }
}
