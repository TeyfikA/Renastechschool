package classAssignments;

public class IfElse16Dec {
    public static void main(String[] args) {
        double Georgian=85, English=89, Maths=90, Science= 75, Computer= 88, German= 95;
        double percentages=(((Georgian+English+Maths+Science+Computer+German)/600)*100);
        System.out.println(percentages);
        if (percentages<=40)
        System.out.println("Fail");
        else if(percentages>=40&&percentages<50)
            System.out.println("Third");
        else if(percentages>=50 && percentages<60)
        System.out.println("Second");
        else if (percentages>=60 && percentages<75 )
            System.out.println("First");
         else if(percentages>=75);
        System.out.println("First with Distinction");


    }
}
