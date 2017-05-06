package console;

import java.util.Scanner;

public class Input {
	
	@SuppressWarnings("resource")
	public static String stringEingabe(){
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.nextLine();
		return eingabe;
	}

	@SuppressWarnings("resource")
	public static String stringEingabe(String text){
		Scanner sc = new Scanner(System.in);
		Output.out(text);
		String eingabe = sc.nextLine();
		return eingabe;
	}
	
	@SuppressWarnings("resource")
	public static int intEingabe(){
		Scanner sc = new Scanner(System.in);
		int eingabe = Integer.parseInt(sc.nextLine());
		return eingabe;
	}
	
}
