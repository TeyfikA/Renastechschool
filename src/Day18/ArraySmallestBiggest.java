package Day18;

import java.util.Scanner;

public class ArraySmallestBiggest {
    public static void main(String[] args) {
        Scanner ta= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= ta.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter"+ size+"elements");
        for(int i=0; i<arr.length; i++){
            arr[i]= ta.nextInt();
        }
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]<smallest) smallest=arr[i];
            if(arr[i]>largest) largest=arr[i];
        }
        System.out.println("Smallest=" +smallest);
        System.out.println("largest=" + largest);
    }
}
