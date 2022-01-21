package Day23;

public class C3StaticMethod {
    public static void main(String[] args) {
        Student.play();
        System.out.println();

    }
}
class Student{
    private static String university="Harvard";
    private String name;
    private String course;
    static void play(){
        System.out.println("Student is playing");
    }

}