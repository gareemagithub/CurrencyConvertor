package CurrencyConvertor;

import java.util.Scanner;

public class RuppeeConvert {
    public static void main(String[] args) {
        //enter the currency which user want to convert from Rupee
        System.out.println("Enter the currency converting to:- ");
        System.out.println("1.USD  2.Euro  3.AUD  4.CAD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter choice
            int choice = sc.nextInt();

            System.out.println("Enter amount you want to convert");
            //enter amount
            double amount= sc.nextDouble();

            switch(choice){
                case 1: 
                //converting Ruppee to USD
                   System.out.println(amount+" rupee is equal to "+(amount* 0.012)+" USD");
                   break;
                case 2:
                //converting Ruppee to Euro
                   System.out.println(amount+" rupee is equal to "+(amount* 0.011)+" Euro");
                   break;
                case 3:
                //converting Ruppee to AUD
                   System.out.println(amount+" rupee is equal to "+(amount* 0.019)+" AUD");
                   break;
                case 4:
                //converting Ruppee to CAD
                   System.out.println(amount+" rupee is equal to "+(amount* 0.017)+" CAD");
                   break;
            }
        }
    }
}
