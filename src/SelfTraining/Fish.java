package SelfTraining;

public class Fish {
    String name;
    String breed;
    String color;
    int size;
    double price;
    public Fish (String name, String breed, String color, int size, double price){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.price=price;
        this.size=size;

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(){
        this.breed=breed;

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
