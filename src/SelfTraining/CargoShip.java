package SelfTraining;

public class CargoShip extends Ship {


   /* Design a CargoShip class that extends the Ship class. The CargoShip class should have the
            following members:
    A field for the cargo capacity in tonnage (an int).
    A constructor and appropriate accessors and mutators.
    A tostring method that overrides the tostring method in the base class. The
    CargoShip class's toString method should display only the ship's name and the ship's
    cargo capacity.
    Demonstrate the classes in a program that has a Ship array. Assign various Ship,
    CruiseShip, and CargoShip objects to the array elements. The program should then step
    through the array, calling each object's tostring method.(there are two subclasses and one super class plus it is
     good to use scanner )
    */
    private int CargoCapacityInTonnage;


    public CargoShip(String name, String yearShip, int cargoCapacityInTonnage) {
        super(name, yearShip);
        CargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return CargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        CargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public String toString() {
        return "CargoShip" + "\nname"+ getName()+
                "\nCargoCapacityInTonnage=" + CargoCapacityInTonnage ;
    }

}
