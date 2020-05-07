package vecka38;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) {
	
		// variabler som jag kommer behöva först svaret och sen gissing, answer kommer då vara det random numret som valts och guess det som användaren väljer. 
		int answer, guess;
		// final int MAX visar intervallet alltså man kan max gissa på 100.
		final int MAX = 100;
		
		// Jag har importerat random och scanner klasser där uppe, så här skapar jag objekt den första: Keyboard och andra: rand inom dessa klasser.
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		// Detta betyder att intervallet är mellan 1-100
		answer = rand.nextInt(MAX) + 1;		
		System.out.println("Guess a number between 1 and 100:");
		int guesses;
		
		// Är en loop som säger att man har max 5 gissningar och det minskar för varje gissning tills man inte har nån kvar.
		for(guesses = 5; guesses > 0; guesses-- ) {
			// Detta gör så att personens nästa svar kommer vara guess.
			guess = keyboard.nextInt();
			
			// om gissningen är större än answer så skriver den ut Lower!
		if(guess > answer) {
			System.out.println("Lower!");
			
			// om gissningen är mindre än svaret så skriver den ut Higher!
		}
		if(guess < answer) {
			System.out.println("Higher!");
			
			// om gissningen stämmer överens med svaret så skriver den ut Rätt!
		}
		if (guess == answer){
		System.out.println("Woho!!! The number was " + answer);
		
		}
		}
		// om du har slut på gissningar skriver den ut svaret
		if (guesses == 0) { 
			System.out.println("Sorry but the number was " + answer);
		}
		
			}
				

		
	}

