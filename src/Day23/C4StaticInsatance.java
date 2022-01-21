package Day23;

public class C4StaticInsatance {
    public static void main(String[] args) {
        show();
        C4StaticInsatance.show();
        Temp.display();
        Temp t=new Temp();
        t.display();

    }
    static void show(){
        System.out.println("Hello");
    }
    void play(){
        System.out.println("Hi");
    }
    static class Temp{
        static void display(){
            System.out.println("Slaw");


        }
    }
}
