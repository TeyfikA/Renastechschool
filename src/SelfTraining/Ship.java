package SelfTraining;

public class Ship {
   /* Design a Ship class that the following members:
    A field for the name of the ship (a string).
    A field for the year that the ship was built (a string).
    A constructor and appropriate accessors and mutators.
    A tostring method that displays the ship's name and the year it was built.*/

        private String name;
        private String yearShip;

    public Ship(String name, String yearShip) {
        this.name = name;
        this.yearShip = yearShip;
    }

    public String getName() {
        return name;
    }
//accessors
    public String getYearShip() {
        return yearShip;
    }
//mutators
    public void setYearShip(String yearShip) {
        this.yearShip = yearShip;
    }

    @Override
    public String toString() {
        return "Ship"+
                "\nname=" + name +
                "\nyearShip=" + yearShip;

    }


    }



