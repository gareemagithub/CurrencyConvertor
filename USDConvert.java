package CurrencyConvertor;

import java.util.Scanner;

public class USDConvert {
    public static void main(String[] args) {
        //enter the currency which user want to convert from USD
        System.out.println("Enter the currency converting to:- ");
        System.out.println("1.Ruppee  2.Euro  3.AUD  4. CAD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter choice
            int choice = sc.nextInt();

            System.out.println("Enter amount you want to convert");
            //enter amount
            double amount= sc.nextDouble();

            switch(choice){
                case 1: 
                //converting USD to Ruppee
                   System.out.println(amount+" USD is equal to "+(amount* 86.48)+" Ruppee");
                   break;
                case 2:
                //converting USD to Euro
                   System.out.println(amount+" USD is equal to "+(amount* 0.97)+" Euro");
                   break;
                case 3:
                //converting USD to AUD
                   System.out.println(amount+" USD is equal to "+(amount* 1.61)+" AUD");
                   break;
                case 4:
                //converting USD to CAD
                   System.out.println(amount+" USD is equal to "+(amount* 1.44)+" CAD");
                   break;
            }
        }
    }
}
