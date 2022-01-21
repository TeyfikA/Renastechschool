package Day8;

public class Homework5 {
    static public void main(String[]arg){
        int year=1600;
        if (year%100==0 && year%400==0)
            System.out.println(year + "is a leap year");
        else System.out.println(year + "is not a leap year");
    }
}
