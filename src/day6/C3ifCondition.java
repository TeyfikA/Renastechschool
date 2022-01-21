package day6;

public class C3ifCondition {
   public static void main(String[]arg) {
       int i = 0, j = 50;
       if (j < 40) i++;
       if (j > 50) i = 6 + i;

       if (j == 50) {
           ++i;
           j = j + i;
           System.out.println();

       }
   }

    }

