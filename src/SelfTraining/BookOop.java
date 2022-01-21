package SelfTraining;

public class BookOop {
    /*Write a Java class Book with following features:
    Instance variables :
    title for the title of book of type String.
            author for the author’s name of type String.
            price for the book price of type double.
    Constructor:
    public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
    Instance methods:
    public void setTitle(String title): Used to set the title of book.
    public void setAuthor(String author): Used to set the name of author of book.
    public void setPrice(double price): Used to set the price of book.
    public double getTitle(): This method returns the title of book.
    public double getAuthor(): This method returns the author’s name of book.
    public String toString(): This method printed out book’s details to the screen*/
    String name;
    String author;
    double price;

    public BookOop(String name, String author, double price){
        this.name=name;
        this.author=author;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "BookOop{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +

                '}';
    }
}
