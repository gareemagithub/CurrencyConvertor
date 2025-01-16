package CurrencyConvertor;

import java.util.Scanner;

public class EuroConvert {
    public static void main(String[] args) {
        //enter the currency which user want to convert from Euro
        System.out.println("Enter the currency converting to:- ");
        System.out.println("1.Ruppee  2.USD  3.AUD  4.CAD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter choice
            int choice = sc.nextInt();

            System.out.println("Enter amount you want to convert");
            //enter amount
            double amount= sc.nextDouble();

            switch(choice){
                case 1: 
                 //converting Euro to ruppee
                   System.out.println(amount+" Euro is equal to "+(amount* 88.93)+" Ruppee");
                   break;
                case 2:
                  //converting Euro to USD
                   System.out.println(amount+" Euro is equal to "+(amount* 1.03)+" USD");
                   break;
                case 3:
                  //converting Euro to AUD
                   System.out.println(amount+" Euro is equal to "+(amount* 1.66)+" AUD");
                   break;
                case 4:
                  //converting Euro to CAD
                   System.out.println(amount+" Euro is equal to "+(amount* 1.48)+" CAD");
                   break;
            }
        }
    }
}
