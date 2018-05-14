package NumberGuess;
import java.util.*;

/*
 * Author: Udit Kumar
 * Date: 5/13/2018
 */
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Introduction message
		System.out.println("Welcome to the game of numbers!!!!");
		System.out.println("The rules for the game are: ");
		System.out.println("1) The user inputs 3 values between 0 to 10.");
		System.out.println("2) The values of the user are compared with the computer's values.");
		System.out.println("3) Right guess is awarded 10 points.");
		System.out.println("4) Wrong guess deducts 10 points.");
		System.out.println();
		
		// This block declares all the variables
		double UserInput1, UserInput2, UserInput3,UserScore = 0,ComputerScore = 0;
		int redo;
		ArrayList<Double> userchoice;
		ArrayList<Double> comp_choice; 
		ArrayList<String> compare;
		boolean match = false;
		
		do {
		do {
		// This block takes and evaluates the users input
		System.out.println("Please enter 3 numbers between 0-10:");
		Scanner u_input = new Scanner(System.in);
		UserInput1 = u_input.nextInt();
		UserInput2 = u_input.nextInt();
		UserInput3 = u_input.nextInt();
		if ((UserInput1 < 0 || UserInput1 > 10) || (UserInput2 < 0 || UserInput2 > 10) || (UserInput3 < 0 || UserInput3 > 10)) {
			System.out.println("Please input numbers between 0-10");
		}
		}while ((UserInput1 < 0 || UserInput1 > 10) || (UserInput2 < 0 || UserInput2 > 10) || (UserInput3 < 0 || UserInput3 > 10));
		
		Numbers user_in = new Numbers(); // creates an object for numbers
		userchoice = user_in.userinput(UserInput1, UserInput2, UserInput3); // passes the user input to be stored
		comp_choice = user_in.computer(); // stores the computers choice
		
		compare = new ArrayList<String>();
		
		// Compares the values of the two arrays
		for (Double temp: userchoice) {
			compare.add((comp_choice.contains(temp) ? "Yes" : "No"));
		}
		// Keeps track of the score
		for (String temp2: compare) {
			if (temp2.contains("No")) {
				match = false;
			}
			else {
				match = true;
			}
			if (match == true) {
				UserScore++;
			}else {
				ComputerScore++;
			}
		}
		
		// Prints out the users input and computer's numbers and the score
		System.out.println("Your numbers were: " + userchoice);
		System.out.println("The Computer chose: " + comp_choice);
		System.out.println("Your score is: " + (int)UserScore);
		System.out.println("The computer score is: " + (int)ComputerScore);
		
		if (UserScore == 3) {
			System.out.println("Wow, you were able to guess all the numbers right!!");
		}
		
		if (UserScore>ComputerScore) {
			System.out.println("Looks like the computer couldn't compete with you!!");
		} else {
			System.out.println("Looks like today wasn't your day, better luck next time!");
		}
		
		// Asks for another game
		System.out.println();
		System.out.print("Wanna give the game another shot? If so, ");
		System.out.println("input 1 to repeat and 0 to end the game:");
		Scanner repeat = new Scanner(System.in);
		redo = repeat.nextInt();
		if (redo == 0) {{
				System.out.println("Thank you for playing, hope to see you soon!");
			}
		}
	} while (redo == 1);
	}}


