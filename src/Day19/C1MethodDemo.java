package Day19;

public class C1MethodDemo {
    public static void main(String[] args) {
        show("Tom", 65);
        show();
        show("Jerry", 75);
    }
    static void show(String name, int salary){
        System.out.println(name+"\t"+ 75 );
    }
    static void show(){
        System.out.println("no-args show method");
    }
}
