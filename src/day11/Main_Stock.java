package day11;

import java.util.Scanner;

public class Main_Stock {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Getting stock information from user.
		 */
		Stock_function st1 = new Stock_function();
		boolean temp=true;
		while(temp) {
			System.out.println("Enter how many stocks you want to add :");
			int n = sc.nextInt();
			Stock_function[] stockList = new Stock_function[n];
			for(int i=0; i<n; i++) {
				System.out.println("Enter the name, no of share, share price ");
				String name = sc.next();
				int nofs = sc.nextInt();
				int price = sc.nextInt();
				stockList[i] = new Stock_function(name, nofs, price);
			}
			/*
			 * Displaying the entered stock information.
			 */
			for(int i=0; i<n; i++) {
				Stock_function st = stockList[i];
				st.display();
				System.out.println("-----------------------------");
			}
			
			/*
			 * Calculating total stock by company wise.
			 */
			System.out.println("Enter the name of the company to calculate the total stock");
			String na= sc.next();
			for(int i=0; i<n; i++) {
				Stock_function st = stockList[i];
				if(na.equals(st.get_Stock_name())) {
					st.calculate();
					break;
				}
			}
			temp=st1.message();
		}
		
		
	}

}
