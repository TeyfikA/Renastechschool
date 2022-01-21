package Day23;

public class C4StaticMethod {
    public static void main(String[] args) {
        new Demo(). play();
        Demo d=new Demo(); d.play();


    }
}
class Demo{
    static int a=10;
    static void show(){
        System.out.println("show");
        //play();//error: a non-static cannot be called directly from inside an insatance staticc method
    }
    void play(){
        System.out.println("play");
        show();
    }
}