package codereview;

public class JavaDemo {

    public static void main(String[] args) {
        for (int i = 8; i > 1; i = i - 2) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}