package mylesBAnotherYype;
/*
 * Myles Benson
 * APCS
 * 3/15
 */

public class Commission extends Hourly {
	
	private double totalSales;
	private double cRate;
	
	public Commission (String name, String address, String phoneNum, String ssn, double rate, double comRate){
		super(name, address, phoneNum, ssn, rate);
		cRate = comRate;
		totalSales=0;
	}
	
	public void addSales(double totSales){
		totalSales += totSales;
	}
	
	public double pay(){
		double payment =  super.pay() + (totalSales*cRate);
		totalSales = 0;
		return payment;
	}
	
	public String toString(){
		String finalOutPut;
		finalOutPut = super.toString() + " Total Sales made: " + totalSales;
		return finalOutPut;
	}

}