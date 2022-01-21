package SelfTraining;

public class BookOopMain {
    public static void main(String[] args) {
        BookOop b1= new BookOop("Volkan vurusu", "Kefo",45.5);
        System.out.println(b1.toString());
        b1.setName("Kefonun vurusu");
        System.out.println(b1.getName());
        b1.setPrice(67.8);
        System.out.println(b1.getPrice());
    }
}
