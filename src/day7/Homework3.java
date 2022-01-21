package day7;

public class Homework3 {
    public static void main(String[] arg){
       /* marks			Grade
        100			        O
        >=90 and <100		A
        >=75 and <90		B
        >=60 and <75		C
        >=40 and <60		D
        <40			        E*/
        int grade= 80;
        if (grade<100) System.out.println("The student is grade A");
        else if(grade>=100 && grade<=90 ) System.out.println("The student is grade A");
    }
}
