package day11;

import java.util.Scanner;

public class Account {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean temp = true;
		Account_function af = new Account_function();
		while (temp) {
			System.out.println("1.To Withdraw money\n2.TO view current balance");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				double amount = sc.nextDouble();
				af.compute(amount);
				break;
			case 2:
				af.display();
				temp = af.message();
				break;
			}
		}

	}

}
