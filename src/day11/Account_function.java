package day11;

public class Account_function implements Account_interface {
	private double total_balance;
	/*
	 * Initalization of the total balance.
	 */
	public Account_function() {
		this.total_balance = 200000;
	}
	/**
	 * Method to withdraw the amount from total balance.
	 * @param amnt - passing the amount to withdraw from the account.
	 */
	public void compute(double amnt) {
		if (amnt > total_balance) {
			System.out.println("Sorry you money cannot be debited as it exceeds the total available balance");
			System.out.println("Your available balance is = " + total_balance);
		} else {
			total_balance -= amnt;
			System.out.println("RS " + amnt + " has been deited and your new balance is = " + total_balance);
		}

	}
	/*
	 * Method to display the available balance,
	 */
	public void display() {
		System.out.println("Your available balance is = " + total_balance);
	}
	/*
	 * Method to ask the users whether they want to continue withdrawal process.
	 */
	public boolean message() {
		System.out.println("Do yo wish to continue Y/N");
		char ch = Account.sc.next().charAt(0);
		if (ch == 'Y') {
			return true;
		}
		return false;
	}
}
