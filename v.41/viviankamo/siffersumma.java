package viviankamo;

import java.util.Scanner;

public class siffersumma {

	public static void main(String[] args) {
		
	int digit;
	int number;
	int sum = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("skriv ett heltal");
	
	number = input.nextInt();
	
	while (number != 0) {
		
		digit = number % 10;
		sum += digit;
		number /= 10;
	
	}
	
	System.out.println(sum);
		
	
	

	}

}
