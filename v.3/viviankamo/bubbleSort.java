package viviankamo;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
	
		int[] numbers = {1,2,3,4,5,6,7,0,4,3,6,9,7,10};
		boolean swapped;
		int temp;
		
		System.out.println(Arrays.toString(numbers));
		
		do {
		
		swapped = false; //nollställer swapped i början på jämförelsen
		
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i+1]) { // byter plats på två intillig
				temp = numbers[i]; //sparar tillfälligt värdet på vänstra si
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
				swapped = true;
				System.out.println(Arrays.toString(numbers));
		}

	}
		} while (swapped);
		
		
	}
}
