package Day17;

import java.util.Scanner;

public class C4Array2D {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        System.out.println("Enter a Array");
        int array[][] = new int[ta.nextInt()][ta.nextInt()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ta.nextInt();

            }

            System.out.println("Entered second array");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);




      /*  int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,},

        };
        //System.out.println(arr.length);
        //System.out.println(arr[1]);
        for (int i = 0; i < arr.length; ++i){
            for (int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+ " ");
            }
        }*/
            }
        }
        System.out.println();
    }
}