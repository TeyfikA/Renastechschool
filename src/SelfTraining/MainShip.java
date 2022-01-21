package SelfTraining;

import java.util.concurrent.Callable;

public class MainShip {
    public static void main(String[] args) {
        Ship ta= new Ship("Volkan", "1983");
        CruiseShip va=new CruiseShip("Ogun","1967", 67);
        CargoShip ka=new CargoShip("Kadir", "1937", 98);
        Ship[] th={ta,va,ka};
        for(int i=0; i< th.length; ++i) {
            System.out.println(th[i].toString());



        }
        System.out.println();
        }

    }

