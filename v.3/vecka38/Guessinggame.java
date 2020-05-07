package vecka38;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) {
	
		// variabler som jag kommer beh�va f�rst svaret och sen gissing, answer kommer d� vara det random numret som valts och guess det som anv�ndaren v�ljer. 
		int answer, guess;
		// final int MAX visar intervallet allts� man kan max gissa p� 100.
		final int MAX = 100;
		
		// Jag har importerat random och scanner klasser d�r uppe, s� h�r skapar jag objekt den f�rsta: Keyboard och andra: rand inom dessa klasser.
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		// Detta betyder att intervallet �r mellan 1-100
		answer = rand.nextInt(MAX) + 1;		
		System.out.println("Guess a number between 1 and 100:");
		int guesses;
		
		// �r en loop som s�ger att man har max 5 gissningar och det minskar f�r varje gissning tills man inte har n�n kvar.
		for(guesses = 5; guesses > 0; guesses-- ) {
			// Detta g�r s� att personens n�sta svar kommer vara guess.
			guess = keyboard.nextInt();
			
			// om gissningen �r st�rre �n answer s� skriver den ut Lower!
		if(guess > answer) {
			System.out.println("Lower!");
			
			// om gissningen �r mindre �n svaret s� skriver den ut Higher!
		}
		if(guess < answer) {
			System.out.println("Higher!");
			
			// om gissningen st�mmer �verens med svaret s� skriver den ut R�tt!
		}
		if (guess == answer){
		System.out.println("Woho!!! The number was " + answer);
		
		}
		}
		// om du har slut p� gissningar skriver den ut svaret
		if (guesses == 0) { 
			System.out.println("Sorry but the number was " + answer);
		}
		
			}
				

		
	}

