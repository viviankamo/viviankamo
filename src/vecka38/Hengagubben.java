package vecka38;

import java.util.Random;
import java.util.Scanner;

public class Hengagubben {
	public static char[] Doldbokstav;
	public static void main(String[] args)
	
	{
		// Instruktioner till spelaren som skrivs ut n�r spelet k�rs
		System.out.println("Welcome to the best hangman game!");
		System.out.println("The point of the game is to guess the secret word");
		System.out.println("Careful you only have 3 chances, good luck!");
		
		
		
		// s�ger att input fr�n (spelaren) kommer ges  
		Scanner input = new Scanner(System.in);
		// G�r s� att ett random ord fr�n Arraylistan blir valt 
        Random r = new Random();
        String[]arr = { "creative", "magazine", "sherlock", "prejudice", "freedom", "brutal", "viking", "proposal", "garden", "makeup"}; 
 
        // detta visar l�ngden p� ordet 
        String word = arr[r.nextInt(arr.length)];
        // kollar vilka bokst�ver som finns i ordet s� 
        char[] CharArr=word.toCharArray(); 
        
        // beteckningen f�r doldbokstav �r [i] och n�r man gissat r�tt blir bokstaven synlig och man f�r gissa p� n�sta
        for(int i=0;i<Doldbokstav.length;i++)
    {
        // G�r s� att bokst�verna skrivs ut som detta tecknet * ist�llet f�r det hemliga ordet
        Doldbokstav[i] = '*';
        System.out.print(Doldbokstav[i]);
    }
        // Hur m�nga chanser man f�r att gissa fel (3 chanser)
        for (int i=1; i<=4; i++) 
        
    {
    	   
        // instuerar att man ska gissa p� en bokstav
    	System.out.printf("\nGuess a Letter:");
        // G�r s� att man kan skriva in och gissa p� en bokstav
        char Bokstav = input.next().charAt(0);
        
        // om man gissar p� en bokstav (D) och den ser i ordet att bokstaven redan existerar skriver den ut att den redan finns  
        for (int D=0;D<CharArr.length; D++)
        {
        if(Bokstav == Doldbokstav[D])
        {
        System.out.println("You have already guessed this letter");
        
        }
        // Ifall bokstaven finns i ordet s� s�tts den in ist�llet f�r tecknet(*) och skriver ut att gissingen var r�tt
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
        // om man svarar fel s� ska detta h�nda: 
        switch(i+0)
        {       // f�rsta felet skriver ut att man har 3 fler chanser
                case 1: System.err.printf("\nYou have 3 more chances");
                // break g�r s� att vid n�sta tillf�lle du svarar fel hoppar den till n�sta scenario
                    break;
                // skriver ut att man har 2 chanser... osv
                case 2: System.err.printf("\nYou have 2 more chances");
                    break;
                case 3: System.err.printf("\nYou have 1 more chance");
                    break;
                    // H�r har man f�rlorat och har slut p� chanser 
                case 4: System.err.printf("\nYou lost! Try again...");
        }
        // hoppar �ver en rad 
        System.out.printf("\n");
        // om man gissat alla bokst�ver o det matchar ordet ska det skriva ut : congratulations....
        if ((new String(word)).equals(new String(Doldbokstav))) 
        {
        System.err.printf("\nConrats you found the secret word! Play again...\n");
        break;
   
                }
}


	}
}






