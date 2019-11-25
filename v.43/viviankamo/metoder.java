package viviankamo;

import java.util.Scanner;

public class metoder {

	 static String main(String[] args) {
		// TODO Auto-generated method stub
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("vänligen skriv in två tal:");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstaTal(tal1, tal2));
		
		/**
		 * Jämför två heltal och utvärderar vilket som är minst samt skickar tillbaka hälsning.
		 * @param tal1
		 * @param tal2
		 * @return String hel
		 */
		
	 }
	    static void minstaTal(int tal1, int tal2) {
		
		if (tal1 <= tal2) {
			System.out.println("minsta talet är: " + tal1);
			}
		else {
			System.out.println("minsta talet: " + tal2);
		}
		
		String hej = "metoden är klar";
		
		return hej;

	}

}
