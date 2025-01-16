package CurrencyConvertor;

import java.util.Scanner;

public class AUDConvert {
    public static void main(String[] args) {
        //enter the currency which user want to convert from AUD
        System.out.println("Enter the currency converting to:- ");
        System.out.println("1.Ruppee  2.USD  3.Euro  4.CAD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter choice
            int choice = sc.nextInt();

            System.out.println("Enter amount you want to convert");
            //enter amount
            double amount= sc.nextDouble();

            switch(choice){
                case 1: 
                   //converting AUD to ruppee
                   System.out.println(amount+" AUD is equal to "+(amount* 53.61)+" Ruppee");
                   break;
                case 2:
                   //converting AUD to USD
                   System.out.println(amount+" AUD is equal to "+(amount* 0.62)+" USD");
                   break;
                case 3:
                   //converting AUD to Euro
                   System.out.println(amount+" AUD is equal to "+(amount* 0.60)+" Euro");
                   break;
                case 4:
                   //converting AUD to CAD
                   System.out.println(amount+" AUD is equal to "+(amount* 0.89)+" CAD");
                   break;
            }
        }
    }
}
