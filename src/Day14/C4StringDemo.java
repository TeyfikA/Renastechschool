package Day14;

public class C4StringDemo {
    public static void main(String[] args) {
        String s1= "Rihana";
        String s2=new String ("Rihana");
        System.out.println(s1==s2);//false
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.length()== s2.length());// true
    }
}
