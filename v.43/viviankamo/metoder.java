package viviankamo;

import java.util.Scanner;

public class metoder {

	 static String main(String[] args) {
		// TODO Auto-generated method stub
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("v�nligen skriv in tv� tal:");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstaTal(tal1, tal2));
		
		/**
		 * J�mf�r tv� heltal och utv�rderar vilket som �r minst samt skickar tillbaka h�lsning.
		 * @param tal1
		 * @param tal2
		 * @return String hel
		 */
		
	 }
	    static void minstaTal(int tal1, int tal2) {
		
		if (tal1 <= tal2) {
			System.out.println("minsta talet �r: " + tal1);
			}
		else {
			System.out.println("minsta talet: " + tal2);
		}
		
		String hej = "metoden �r klar";
		
		return hej;

	}

}
