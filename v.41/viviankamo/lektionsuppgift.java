package viviankamo;

import java.util.Scanner;

public class lektionsuppgift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int summa = 0;
		int highest = -10000;
		int lowest = 10000;
		
		for (int index = 0; index < 1 ; index++)
		{
			System.out.println(" välj ett heltal ");
			
			int tal = input.nextInt();
			
			if (tal < lowest)
			{
				lowest = tal;
			}
			
			summa += tal;
		
			System.out.println(" Lägsta talet är: \t" + lowest);
		
		}
		
	}

}
