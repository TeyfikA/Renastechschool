package Day21;

import java.util.Arrays;
import java.util.Scanner;

public class C1RevisionArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arr[]= new int[scan.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Entered arra is : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Suing for each loop");
        for(int element:arr)
            System.out.println(element);

    }
}
