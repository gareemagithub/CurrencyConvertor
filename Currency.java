package CurrencyConvertor;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        // enter the currency from which user want to convert the currency
        System.out.println("Enter the currency converting from:- ");
        System.out.println("1.Ruppee  2.USD  3.Euro  4.AUD  5.CAD");

        try (Scanner sc = new Scanner(System.in)) {
            //enter the choice
            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                //if user select ruppee
                    RuppeeConvert.main(args);
                    break;
                case 2:
                //if user select USD
                   USDConvert.main(args);
                   break;
                case 3:
                //if user select Euro
                   EuroConvert.main(args);
                   break;
                case 4:
                //if user select AUD
                   AUDConvert.main(args);
                   break;
                case 5:
                //if user select CAD
                   CADConvert.main(args);
                   break;
            }
        }
    }
}
