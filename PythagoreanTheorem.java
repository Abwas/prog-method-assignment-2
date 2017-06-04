/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;
import java.lang.Math;

public class PythagoreanTheorem extends ConsoleProgram {
	
	public void run() {
		
		println("Enter values to compute Pythagorean Theorem.");
		
		//prompt the user to enter a value for side a
		int a = readInt("Enter a: ");
		
		//prompt the user to enter a value for side b
		int b = readInt("Enter b: ");
		
		/*computes the value for c i.e. add the squares of a & b and 
		 * then take the square root
		 */
		double total = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//prints the result to the console
		println("c = " + total);
	}
}
