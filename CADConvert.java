package CurrencyConvertor;

import java.util.Scanner;

public class CADConvert {
    public static void main(String[] args) {
        //enter the currency which user want to convert from CAD
        System.out.println("Enter the currency converting to:- ");
        System.out.println("1.Ruppee  2.USD  3.Euro  4.AUD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter choice
            int choice = sc.nextInt();

            System.out.println("Enter amount you want to convert");
            //enter amount
            double amount= sc.nextDouble();

            switch(choice){
                case 1: 
                //converting CAD to ruppee
                   System.out.println(amount+" CAD is equal to "+(amount* 60.20)+" Ruppee");
                   break;
                case 2:
                //converting CAD to USD
                   System.out.println(amount+" CAD is equal to "+(amount* 0.70)+" USD");
                   break;
                case 3:
                //converting CAD to Euro
                   System.out.println(amount+" CAD is equal to "+(amount* 0.68)+" Euro");
                   break;
                case 4:
                //converting CAD to AUD
                   System.out.println(amount+" CAD is equal to "+(amount* 1.12)+" AUD");
                   break;
            }
        }
    }
}
