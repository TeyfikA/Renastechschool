package Day16Array;

import java.util.Scanner;

public class C7ARRAY {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scan.nextInt();
        double arr[]=new double[size];
        for(int i=0; i<size ; i++){
            System.out.println("arr["+i+"]=");
            arr[i]=scan.nextDouble();
        }
        double sum=0.0;
        for(int i=0; i<arr.length; i++);
    }
}
