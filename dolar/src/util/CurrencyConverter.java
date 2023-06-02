package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double calculator(double dollar, double quantity) {
		return dollar * quantity * (IOF + 1);
	}

}
