package viviankamo;

import java.util.Scanner;

public class methodlibrary {

	public static void main(String[] args) {

	}
	
	public static void fahrenheitToKelvin(double fahrenheit) {
		
		double kelvin;
		
		kelvin = (fahrenheit - 32)*5/9 + 273.15;
		System.out.println(kelvin);
	} 



    public static void kelvinToCelcious(double kelvin) {
    	
    	double celcious;
    	
    	celcious = (kelvin - 273.15);
    	System.out.println(celcious);
    }


    public static void KmHToMs(double KmH) {
    	
    	double Ms;
    	
    	Ms = (KmH / 3.6);
    	System.out.println(Ms);
    }

   public static void kinetiskenergi(double massa, double hastighet) {
	   
	   double kinetisk;
	   
	   kinetisk = massa * (hastighet * hastighet) / 2;
	   System.out.println(kinetisk);
   }
   
   public static void potentiellenergi(double massa, double height) {
	   
	   double potentiell;
	   
	   potentiell = massa * height * 9.82;
	   
   }
   
   public static void delta (double first, double second, double last) {
	   
	   double delta;
	   
	   delta = (first + second + last) /3;
	   
	   System.out.println(delta);
   }
   
   public static String smalletters(String word) {
	   
	   word = word.toLowerCase();
	   
	   System.out.println(word);
   }
   
   public static String storaletter(String word) {
	   
	   word = word.replace('o', '0').toUpperCase();
	   
	   System.out.println(word);
			   
		}
   
   public static void svtTime(double distance, double velocity) {
	   
	   System.out.println(distance / velocity);
	   
   }
   
   public static void work(double force, double distance) {
	   
	   System.out.println(force * distance);
   }
    
   public static void velocityToHeight(double velocity) {
	   
	   System.out.println((velocity*velocity)/(2*9.82));
   }
   
   public static void sphereVolumeToRadius(double Volume) {
	   
	   System.out.println(Math.pow(( 3*Volume)/(Math.PI*4), 0.33));
	   
	   
   }
   
   
}
  
   
