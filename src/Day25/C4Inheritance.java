package Day25;

public class C4Inheritance {
    public static void main(String[] args) {
       BMW b= new BMW(); b.accelerate();
        Car a= new Car(); a.accelerate();
    }

}
class Car{
    void accelerate(){
        System.out.println("accelerating...");
    }
}
//inheritance works only with teh extends keyword
// BMW is the child class of the Car class
// BMW is a Car
class BMW extends Car{

}
