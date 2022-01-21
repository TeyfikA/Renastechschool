package SelfTraining;

import java.util.Scanner;

public class CalculaterSwitschCase {
    public static void main(String[] args) {




            int num1=0,num2=0,option,ta;
            do
            {
                Scanner sc = new Scanner(System.in);

                System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
                option = sc.nextInt();
                if(option!=4){
                    System.out.println("Enter  first number");
                    num1=sc.nextInt();
                    System.out.println("Enter the second number");
                    num2=sc.nextInt();
                }
                else
                    break;
                switch(option)
                {
                    case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
                        break;
                    case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
                        break;
                    case 3:System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                        break;
                    case 4:
                        System.out.println("Division of"+num1+"and"+num2+"is"+(num1*num2));
                    case 5:
                        System.out.println();


                    default: System.out.println("Invalid choice");
                }
                    System.out.println("Do you want to continue?1.Yes 2.No");
                      ta=sc.nextInt();
                 }while(ta==1);
        }
    }

