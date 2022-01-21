package Day15;

import java.util.Scanner;

public class C3Equals {
    public static void main(String[] args) {
       /* String str = "slav";
        System.out.println(str.equals("Slav"));
        System.out.println(str.equals("SLAV"));
        System.out.println(str.equalsIgnoreCase("SLAV"));*/
        Scanner scan= new Scanner(System.in);
        String username="proCoder";
        String password="juT7%$";
        System.out.println("Enter Username");
        String uname= scan.next();
        System.out.println("Enter password");
        String pass=scan.next();
        if(uname.equalsIgnoreCase(username) && pass.equals(password)) {
            System.out.println("Login succesful");
        }else{
            System.out.println("Login unsucessful");
        }




    }
}
