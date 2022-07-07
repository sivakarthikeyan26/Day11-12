package day11;

public abstract class Stock {
	/*
	 * Abstract method
	 */
	public abstract void calculate();
	/*
	 * Abstract method
	 */
	public abstract void display();
	/*
	 * normal method
	 */
	public boolean message() {
		System.out.println("Do you wish to continue? : Y/N");
		char ch = Main_Stock.sc.next().charAt(0);
		if(ch=='N') {
			return false;
		}
		return true;
	}
}
