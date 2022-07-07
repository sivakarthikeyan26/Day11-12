package day11;

public class Stock_function extends Stock {
	private String stock_name;
	private int no_of_share;
	private int share_price;
	/*
	 * Empty constructor
	 */
	public Stock_function() {}
	/*
	 * constructor for storing the shares
	 */
	public Stock_function(String sname, int nos, int price){
		this.stock_name=sname;
		this.no_of_share=nos;
		this.share_price=price;
	}
	/*
	 * Getter
	 */
	public String get_Stock_name() {
		return stock_name;
	}
	/*
	 * Method to calculate total share each company
	 */
	public void calculate() {
		System.out.println("The total value of the "+stock_name+" is : "+(no_of_share*share_price));
	}
	/*
	 * Method to display the share information
	 */
	public void display() {
		System.out.println("Stock Name : "+stock_name);
		System.out.println("Number of share : "+no_of_share);
		System.out.println("Share price : "+share_price);
	}
}
