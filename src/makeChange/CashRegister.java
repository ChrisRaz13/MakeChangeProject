package makeChange;

import java.util.Scanner;

public class CashRegister {



	public static void main(String[] args) {
//		 Testing git push
		
		Scanner sc = new Scanner(System.in);
		int twenty_dollar_bill = 2000;
		int ten_dollar_bill = 1000;
		int five_dollar_bill = 500;
		int one_dollar_bill = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 05;
		int penny = 01;
	
		//had to use cents because of decimal issues
		
		System.out.println("Enter the price of the item:");
        double price = sc.nextDouble();
        int priceInCents = (int) (price * 100);

        System.out.println("Enter the amount tendered by the customer:");
        double paid = sc.nextDouble();
        int paidInCents = (int) (paid * 100);

        if (priceInCents == paidInCents) {
            System.out.println("Exact amount given. No change.");
        } else if (priceInCents > paidInCents) {
            System.out.println("Not enough money provided.");
        } else {
            int changeInCents = paidInCents - priceInCents;
            double changeInDollars = changeInCents / 100.0;

            System.out.println("Change to be given: $" + changeInDollars);

            calculateChange(changeInCents, twenty_dollar_bill, ten_dollar_bill, five_dollar_bill,
                    one_dollar_bill, quarter, dime, nickel, penny);
        }

        sc.close();
    }

    private static void calculateChange(int change, int twentyDollarBill, int tenDollarBill,
            int fiveDollarBill, int oneDollarBill, int quarter, int dime, int nickel, int penny) {

        System.out.println("Change breakdown:");

        int numTwentyDollarBills = change / twentyDollarBill;
        if (numTwentyDollarBills > 0) {
            System.out.println("Twenty dollar bill: " + numTwentyDollarBills);
            change %= twentyDollarBill;
        }

        int numTenDollarBills = change / tenDollarBill;
        if (numTenDollarBills > 0) {
            System.out.println("Ten dollar bill: " + numTenDollarBills);
            change %= tenDollarBill;
        }

        int numFiveDollarBills = change / fiveDollarBill;
        if (numFiveDollarBills > 0) {
            System.out.println("Five dollar bill: " + numFiveDollarBills);
            change %= fiveDollarBill;
        }

        int numOneDollarBills = change / oneDollarBill;
        if (numOneDollarBills > 0) {
            System.out.println("Ones dollar bill: " + numOneDollarBills);
            change %= oneDollarBill;
        }

        int numQuarters = change / quarter;
        if (numQuarters > 0) {
            System.out.println("Quarters: " + numQuarters);
            change %= quarter;
        }

        int numDimes = change / dime;
        if (numDimes > 0) {
            System.out.println("Dimes: " + numDimes);
            change %= dime;
        }

        int numNickels = change / nickel;
        if (numNickels > 0) {
            System.out.println("Nickels: " + numNickels);
            change %= nickel;
        }

        int numPennies = change / penny;
        if (numPennies > 0) {
            System.out.println("Pennies: " + numPennies);
        }
    }
}