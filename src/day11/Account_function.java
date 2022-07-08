package day11;

public class Account_function implements Account_interface {
	private double total_balance;

	public Account_function() {
		this.total_balance = 200000;
	}

	public void compute(double amnt) {
		if (amnt > total_balance) {
			System.out.println("Sorry you money cannot be debited as it exceeds the total available balance");
			System.out.println("Your available balance is = " + total_balance);
		} else {
			total_balance -= amnt;
			System.out.println("RS " + amnt + " has been deited and your new balance is = " + total_balance);
		}

	}

	public void display() {
		System.out.println("Your available balance is = " + total_balance);
	}

	public boolean message() {
		System.out.println("Do yo wish to continue Y/N");
		char ch = Account.sc.next().charAt(0);
		if (ch == 'Y') {
			return true;
		}
		return false;
	}
}
