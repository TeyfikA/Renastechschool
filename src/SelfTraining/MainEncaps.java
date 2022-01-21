package SelfTraining;

public class MainEncaps {
    public static void main(String[] args) {
        Encapsulation b1 = new Encapsulation();//Heap Memory

        System.out.println(b1.getB1());//Stack memory using
        b1.setB1("1234Volkan");
        System.out.println(b1.getB1());
        Encapsulation b2=new Encapsulation();
        System.out.println(b1.getB1());
        b1.setB1("1234Ahmet");
        System.out.println(b1.getB1());



    }
}