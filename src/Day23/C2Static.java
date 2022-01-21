package Day23;

public class C2Static {
    public static void main(String[] args) {
        Emp e1=new Emp("Batman", 250);
        Emp e2=new Emp("Robin", 200);
        System.out.println(e1.company);
        System.out.println(e2.company);
        System.out.println(e1.name);
    }

}
class Emp {
    //A Static variable take memory in the MetaSpace
    static String company = "IBM";
    String name; int salary;
    Emp(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}

