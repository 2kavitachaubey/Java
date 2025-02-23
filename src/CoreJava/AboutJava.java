package CoreJava;

// Developed by James Gosling at Sun Microsoft in 1991.
// First named as Oak from oak tree outside the james office.
// But the oak name is already a trademark so named as java from java coffee.
// Acquire by Orale at 2010.

import java.util.Date;
public class AboutJava {
	public void primitive() {
		byte age = 13;
		int num = 122_343_343;  // We can use underscore for numbers
		long number = 2_434_353_234L; // use L or l for long 
		double dnumber = 343.2525;
		float fnumber = 343.34f; // use f or F for float
		System.out.println(age + " " + num + " " + number + " " + dnumber + " " + fnumber);
		
		//Difference between primitive and reference type
		byte x = 2;
		byte y = x;
		x = 5;
		System.out.println(y);
	}
	public static void main(String[] args) {
		AboutJava a1 = new AboutJava();
		a1.primitive();
		
		Date now = new Date();
		System.out.println(now);
		
	}

}
