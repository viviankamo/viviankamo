package vecka38;

import java.util.Scanner;

public class laxa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int summa = 0;
		int highest = -10000;
		int lowest = 10000;
		
		for (int index = 0; index < 5 ; index++)
		{
			System.out.println(" v�lj ett heltal ");
			
			int tal = input.nextInt();
			
			if(tal > highest)
			{
				highest = tal;
			}
			
			if (tal < lowest)
			{
				lowest = tal;
			}
			
			summa += tal;
		}
		
		int medel = summa / 5;
		
		System.out.println("H�gsta talet �r: /t" + highest);
		
		System.out.println(" L�gsta talet �r: /t" + lowest);
		
		System.out.println(" Medelv�rdet �r: /t" + summa);
		
	}

}
