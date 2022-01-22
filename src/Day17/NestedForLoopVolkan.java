package Day17;

import java.util.Scanner;

public class NestedForLoopVolkan {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        int t[][] = new int[ta.nextInt()][ta.nextInt()];


        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j] = ta.nextInt();


            }

        }
    }

}
