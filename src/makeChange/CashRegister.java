package makeChange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
//		 Testing git push
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the price of the item?");
		double price = sc.nextDouble();
		System.out.println("The item costs $" + price);
		
		System.out.println("How much money was tendered by the customer?");
		double paid = sc.nextDouble();
		System.out.println("Customer paid $" + paid);
		
		if (price == paid) {
			System.out.println("Exact amount given");
		}	
		else if (paid < price) {
			System.out.println("Did not pay enough");
		}
		else if (paid > price) {
			
		}
		
	
			
		
		
		sc.close();
		
		
		
	}

}
