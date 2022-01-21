package Day8;

public class C2Revision {
    public static void main(String[]arg){

        int sal=56120;
                if(sal<1000) System.out.println("Not an employee");
               else if(sal>=1000 && sal<=10000)System.out.println("Software Tester ");
                 else if(sal>10000 && sal<25000)System.out.println("Software Developer ");
                  else if(sal>25000 && sal<50000)System.out.println("Software Manager ");
                 else if(sal>50000 && sal<100000)System.out.println("Team Leader ");
                 else System.out.println("Hr Manager");
    }


}
