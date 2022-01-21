package Day20;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,};
        String[] names = {"ridvan", "Bahast", "Musab"};
        char[] letters = {'w', 'b', 'x', 'd', 'e'};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nUsing Arrays.sort method...");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));
        System.out.println(
                concatenation("hello", "Java", "world")
        );
    }

    public static String concatenation(String str1, String str2) {
        return str1.concat(" " + str2);
    }

    public static String concatenation(String str1, String str2, String str3) {
        return str1.concat(" " + str2).concat("" + str3);

    }
}
