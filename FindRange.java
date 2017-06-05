/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	//specifies the value of the sentinel
	private static final int Sentinel = 0;
	
	//runs the program
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		//initializes the minimum value
		int min = 0;
		
		//initializes the maximum value
		int max = 0;
		
		
		int val = readInt(" ? ");
		//iterates using while loop when the condition is true
		while (val == Sentinel) {
			
		println("This is not valid, please enter a valid number");	
			//prompts the user to enter a value
			int val = readInt(" ? ");

			if (val > max) {
				max = val;
				
			//checks if the value is less than the minimum value
			//and then assign it as the smallest
			} else if (val < min) {
				min = val;
			} 
		}
		
		//prints out the smallest number 
		println("smallest: " + min);
		
		//prints out the largest number
		println("largest: " + max);
		
	}
}

