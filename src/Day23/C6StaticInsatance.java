package Day23;

public class C6StaticInsatance {
    public static void main(String[] args) {
        new Apple().eatApple();
        new Apple().eatApple();
        Apple a1=new Apple();
       a1.eatApple();
        System.out.println(Apple.getNumber());
        System.out.println("No. of apple objects are "+ Apple.appleCount);
    }
}
class Apple{
    static int appleCount;
    void eatApple(){
        System.out.println("Eating apple");

        }
    Apple() {
        appleCount++;
    }


    static int getNumber(){
        return 5;
    }

}