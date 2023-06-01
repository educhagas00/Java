package util;

public class CurrencyConverter {
	
	public static double IOF = 0.6;
	
	public static double calculator(double dollar, double quantity) {
		return dollar * quantity * (IOF);
	}

}
