package SelfTraining;

public class CruiseShip extends Ship {
    /*Design a CruiseShip class that extends the Ship class. The CruiseShip class should have
            the following members:
    A field for the maximum number of passengers (an int).
    A constructor and appropriate accessors and mutators.
    A tostring method that overrides the tostring method in the base class. The
    CruiseShip class's toString method should display only the ship's name and the
    maximum number of passengers.*/
    private int NumberOfPassengers;

    public CruiseShip(String name, String yearShip, int numberOfPassengers) {
        super(name, yearShip);
        this.NumberOfPassengers = numberOfPassengers;


    }

    public int getNumberOfPassengers() {
        return NumberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        NumberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip" + "\nname"+ getName()+
                "\nNumberOfPassengers=" + NumberOfPassengers;
    }
}

