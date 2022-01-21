package Day17;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class traning {
    public static void main(String[] args) {
       /* WAP to enter the dimensions(no. of rows and columns) of a 2-D array and then enter the
        elements and print them. Also, print the sum and average of the elements.*/
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a row");
        int r=scn.nextInt();
        System.out.println("Enter the column");
        int c=scn.nextInt();
        int arr[][]= new int[r][c];
        System.out.println("Enter the elements ");
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=scn.nextInt();
            }


        }
        System.out.println("Entered array is ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();

        }
    }


}
