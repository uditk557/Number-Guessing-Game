package NumberGuess;
import java.util.*;

/*
 * Author: Udit Kumar
 * Date: 5/13/2018
 */

public class Numbers {

	public int userinput; // for the users value
	public int computerinput; // for the computers value
	
	public ArrayList<Double> userinput(double a, double b, double c) {
		
		ArrayList<Double> user = new ArrayList<Double>(); // creates an array list for users guess
		// This block adds the user values to the list
		user.add(a);
		user.add(b);
		user.add(c);
		
		return user;
	}

	public ArrayList<Double> computer() {
		
		// This block creates a series of random numbers
		double rand1 =  (int) (Math.random() * 11);
		double rand2 =  (int) (Math.random() * 11);
		double rand3 =  (int) (Math.random() * 11);
		
		ArrayList<Double> comp = new ArrayList<Double>(); // Array to store computer Values
		
		// This block adds the computer random values to the arraylist
		comp.add(rand1);
		comp.add(rand2);
		comp.add(rand3);
		
		return comp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
