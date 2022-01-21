package SelfTraining;

public class Encapsulation {//Class
    private String b1="Ogun";//Instance Non Static variable &Stack memmory

  public String getB1() {//Constrauctor
        return b1;
    }

    public void setB1(String b1) {
      if (b1.contains("1234"))
        this.b1 = b1;
    }
}
