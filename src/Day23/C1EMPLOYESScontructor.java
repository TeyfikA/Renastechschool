package Day23;

public class C1EMPLOYESScontructor {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom",(byte)25, 65000,"NYC");
        Employee e2 = new Employee("Jerry", (byte)23, 6000, "Austin");
        e2.raiseSalary(1.2);
        System.out.println("NAme:"+e1.getName()+ "\nAGE"+e1.getAge()+"\nSALARY:"+e1.getSalary()+
        "\nLocation:"+e1.getLocation());
        System.out.println("NAme:"+e2.getName()+ "\nAGE"+e2.getAge()+"\nSALARY:"+e2.getSalary()+
                "\nLocation:"+e2.getLocation());

    }
}
   class Employee{
       private String name;
        private byte age; private double salary; private String location; //Attributes

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public byte getAge() {
           return age;
       }

       public void setAge(byte age) {
           this.age = age;
       }

       public double getSalary() {
           return salary;
       }

       public void setSalary(double salary) {
           this.salary = salary;
       }

       public String getLocation() {
           return location;
       }

       public void setLocation(String location) {
           this.location = location;
       }

       void raiseSalary(double raise_percent){
            this.salary=this.salary+raise_percent/100*this.salary;


        }
        public Employee(String name, byte age, double salary, String location){
            this.name=name;
            this.age=age;
            this.salary=salary;
            this.location=location;
        }
    }

