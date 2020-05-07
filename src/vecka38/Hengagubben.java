package vecka38;

import java.util.Random;
import java.util.Scanner;

public class Hengagubben {
	public static char[] Doldbokstav;
	public static void main(String[] args)
	
	{
		// Instruktioner till spelaren som skrivs ut när spelet körs
		System.out.println("Welcome to the best hangman game!");
		System.out.println("The point of the game is to guess the secret word");
		System.out.println("Careful you only have 3 chances, good luck!");
		
		
		
		// säger att input från (spelaren) kommer ges  
		Scanner input = new Scanner(System.in);
		// Gör så att ett random ord från Arraylistan blir valt 
        Random r = new Random();
        String[]arr = { "creative", "magazine", "sherlock", "prejudice", "freedom", "brutal", "viking", "proposal", "garden", "makeup"}; 
 
        // detta visar längden på ordet 
        String word = arr[r.nextInt(arr.length)];
        // kollar vilka bokstäver som finns i ordet så 
        char[] CharArr=word.toCharArray(); 
        
        // beteckningen för doldbokstav är [i] och när man gissat rätt blir bokstaven synlig och man får gissa på nästa
        for(int i=0;i<Doldbokstav.length;i++)
    {
        // Gör så att bokstäverna skrivs ut som detta tecknet * istället för det hemliga ordet
        Doldbokstav[i] = '*';
        System.out.print(Doldbokstav[i]);
    }
        // Hur många chanser man får att gissa fel (3 chanser)
        for (int i=1; i<=4; i++) 
        
    {
    	   
        // instuerar att man ska gissa på en bokstav
    	System.out.printf("\nGuess a Letter:");
        // Gör så att man kan skriva in och gissa på en bokstav
        char Bokstav = input.next().charAt(0);
        
        // om man gissar på en bokstav (D) och den ser i ordet att bokstaven redan existerar skriver den ut att den redan finns  
        for (int D=0;D<CharArr.length; D++)
        {
        if(Bokstav == Doldbokstav[D])
        {
        System.out.println("You have already guessed this letter");
        
        }
        // Ifall bokstaven finns i ordet så sätts den in istället för tecknet(*) och skriver ut att gissingen var rätt
        else
        {
        if(Bokstav == CharArr[D])
        {
        Doldbokstav[D]=Bokstav;
        i--;
        System.out.printf("\nRight guess, keep it up!\n");
        
        }
        }
    }
        
        // visar hur ordet ser ut nu
        System.out.print(Doldbokstav);
        // om man svarar fel så ska detta hända: 
        switch(i+0)
        {       // första felet skriver ut att man har 3 fler chanser
                case 1: System.err.printf("\nYou have 3 more chances");
                // break gör så att vid nästa tillfälle du svarar fel hoppar den till nästa scenario
                    break;
                // skriver ut att man har 2 chanser... osv
                case 2: System.err.printf("\nYou have 2 more chances");
                    break;
                case 3: System.err.printf("\nYou have 1 more chance");
                    break;
                    // Här har man förlorat och har slut på chanser 
                case 4: System.err.printf("\nYou lost! Try again...");
        }
        // hoppar över en rad 
        System.out.printf("\n");
        // om man gissat alla bokstäver o det matchar ordet ska det skriva ut : congratulations....
        if ((new String(word)).equals(new String(Doldbokstav))) 
        {
        System.err.printf("\nConrats you found the secret word! Play again...\n");
        break;
   
                }
}


	}
}






