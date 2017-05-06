package console;


public class Error {
	
	public static void error(String message){
		System.err.println(message);
	}
	
	public static void exception(Exception e){
		System.err.println(e.toString());
	}

}
