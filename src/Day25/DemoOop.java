package Day25;

public class DemoOop {
    public static void main(String[] args) {
        Parent p= new Parent();
        Child c= new Child();
        System.out.println(c.a);
        System.out.println(c.j);
        c.show();

    }

}
class Parent{
    //instance varibale or property
    int a=10;
    // behaviour of the parent
    void show(){
        System.out.println("Hello");
    }
}

class Child extends Parent{
    int j=20;
}
