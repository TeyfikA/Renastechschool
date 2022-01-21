package SelfTraining;

public class MethodClass {
    public static void main(String[] args) {
        Apple myApple= new Apple();
        System.out.println(myApple.price);

    }
}
class Train{
}
class Apple{
    int price=10;
    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price=price;
    }
}