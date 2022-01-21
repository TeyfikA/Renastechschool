package fundamentals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]arg){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= scanner.nextInt();
        for (int k = 0; k<=10; k++){
            System.out.println(k + "*" +k+ "="+(number * k));
        }
    }
}
