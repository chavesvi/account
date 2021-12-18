package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.excepitions.UnacceptableValue;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			Account x = new Account(number, holder, balance, limit);
		
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double value = sc.nextDouble();
			x.withdraw(value);
			System.out.printf("New balance: %.2f", x.getBalance());
	
			sc.close();
		}
		catch (UnacceptableValue e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e){
			System.out.println("Unexpected error");
		}
		
	}

}
