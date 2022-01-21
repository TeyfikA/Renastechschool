package classAssignments;

public class homework6 {
    public static void main(String[] args) {
        double vr1=20.00, vr2=90.00, vr3=(vr1+vr2)*100;
        double remainder=vr3%40.00;
        System.out.println("Remainder is =" +remainder);
        boolean isNoRemainder=remainder==0?true:false;
        System.out.println("isNoremainder="+ isNoRemainder);
        if (isNoRemainder=true)
            System.out.println("Go Some Remainder");

    }
}
