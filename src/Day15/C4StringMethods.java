package Day15;

import java.util.Locale;

public class C4StringMethods {
    public static void main(String[] args) {

        String str = "HumptyDumpty";
        boolean b= str.contains("mpty");
        System.out.println(b);
        System.out.println("HelloFellRello".contains("Fell"));

        String s2= "    hello guys     !   !   ";
        System.out.println(s2.trim());
        System.out.println("slav_chao$NAMASTE".toLowerCase());
        System.out.println("slav_chao$NAMASTE".toUpperCase());
        System.out.println(s2.indexOf("e"));
    }
}
