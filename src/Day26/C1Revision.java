package Day26;

public class C1Revision {
    public static void main(String[] args) {
        Mercedes m= new Mercedes();
        m.show();
    }


}
class Car{
    int i= 10;
    void show(){
        System.out.println("Hello");
    }
}

class Mercedes extends Car{
    void show (){
         System.out.println("Hi");
    }
}
