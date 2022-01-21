package C10;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class FindThePrimeNumber {
    public static void main(String[] args) {
       int n=99;
       //every number has at least 2 factors
        //first is the number itself
        //secon is number 1


        boolean isPrime= true;
        for( int i=2; i<n; i++){
            /**
             * below if condition checks if the given number n is
             * divible by any other number apart from number itself
             */

            if(n%i==0){
                isPrime=false;
            }

        }
        if(isPrime)
        System.out.println("Prime Number");
        else
            System.out.println("Not prime");

    }
}
