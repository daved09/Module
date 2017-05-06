package datentypen;

public class Parser {
	
	public static long parseLong(Object value){
		String puffer = value.toString();
		long val = Long.parseLong(puffer);
		return val;
	}
	
	public static double parseDouble(Object value){
		String puffer = value.toString();
		double val = Double.parseDouble(puffer);
		return val;
	}


	
	public static double round(double value,int places){
		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
	
}
