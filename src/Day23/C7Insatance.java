package Day23;

public class C7Insatance {
    public static void main(String[] args) {
        Foo.husky();
        System.out.println(Foo.bunny());
        new Foo().meta();

    }

}
class Foo{
    static void husky(){
        System.out.println("gruff");
    }
    static String bunny(){
        return "Hello";
    }
    void meta(){
        System.out.println("Hi");
    }
}
