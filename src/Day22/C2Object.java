package Day22;

public class C2Object {
    public static void main(String[] args) {
        Book b1= new Book();
        //Club b2= new Club();
        //System.out.println(b1.title);
        //System.out.println(b1.price);
        //System.out.println(b2.name);
        System.out.println(b1.getTitle());
        System.out.println(b1.getPrice());

    }
}

class Book{
    private String title="Harry Potter";
    private double price= 13.5;
    String getTitle(){return this.title;}
    double getPrice(){return this.price;}


}
class Club{
    String name="Chalsea";
}