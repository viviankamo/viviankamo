package kattis;

import java.util.Scanner;

public class abracadabra {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int n = input.nextInt(); 
		
		for (int s = 1; s <= n; s++)
			System.out.println(s + "Abracadabra");
		
		

	}

}
