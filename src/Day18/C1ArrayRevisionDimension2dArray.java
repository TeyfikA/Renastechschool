package Day18;

import java.util.Scanner;

public class C1ArrayRevisionDimension2dArray {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        System.out.println("Enter the dimensions of the 2 D array");
        int arr[][] = new int[ta.nextInt()][ta.nextInt()];
        System.out.println("Enter the dimensions of the 2 D array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ta.nextInt();
            }
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ta.nextInt();
            }
            System.out.println();
        }
        int smallest= arr[0][0];
        int largest= arr[0][0];
        for(int i=0; i< arr.length; i++){
            for( int j=0; j<arr[i].length; j++){
                if(arr[i][j]<smallest) smallest=arr [i][j];
                if(arr[i][j]>largest) largest= arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Smallest= " +smallest);
        System.out.println("Largest= " +largest);
    }
}