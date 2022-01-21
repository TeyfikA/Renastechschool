package PracticeJavaFriends;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class D6MarksCalculating {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int Georgian, English, Maths, Science, Computer;
        Georgian= scn.nextInt();

        System.out.println("Enter Georgian marks");
        English=scn.nextInt();

        System.out.println("Enter English marks");
        Maths=scn.nextInt();

        System.out.println("Enter Maths marks");
        Science=scn.nextInt();

        System.out.println("Enter Science marks");
        Computer=scn.nextInt();

        System.out.println("Enter Computer marks");
        double percentage;
        percentage=(Georgian+English+Maths+Science+Computer);
        if(percentage<40){
            System.out.println("Fails");
        }
        else if(percentage<50){
            System.out.println("First");

        }
        else if(percentage<60) {
            System.out.println("Second");
        }

        else if(percentage<75){
            System.out.println("Third");
        }
            else{
            System.out.println("First with Distinction");
        }

    }
}
