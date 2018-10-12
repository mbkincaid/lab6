import java.util.Random;
import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {
		
		//variable declarations
		Scanner number = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		int choice = 0;
		String yes;
		int userContinue = 0;
		String userContiue2;
		Object userContinue2;
		
		System.out.println("Hello, welcome to the Grand Circus Casino.");
		System.out.println("Today we'll be playing craps, with a twist");
		System.out.println("You may pick how many sides there on each die");
		
		do {
		System.out.println("How many sides would you like? Please enter a positve integer.");
		
		//HERE
		choice = number.nextInt();
		System.out.println("Enter an integer to roll the dice");
		userContinue = number.nextInt();
		
		
//		int die1 = (int)(Math.random()*6) + 1;
//      int die2 = (int)(Math.random()*6) + 1;

		int die1 = 0;
		int die2 = 0;
		
		die1 = getDieValue(choice);
		die2 = getDieValue(choice);
		System.out.println(die1);
		System.out.println(die2);
		
		if ((die1 + die2) == 7) {
			System.out.println("You crapped out.");
		}
		if ((die1 + die2) == 12) {
			System.out.println("Boxcars.");
		}
		if ((die1 + die2) == 2) {
			System.out.println("Snake Eyes.");
		}
         
		System.out.println("Do you want to continue?");
		userContinue2 = scnr.next();
		
		} while (userContinue2.equals("yes"));
		

	}
		private static int getDieValue(int choice) {
			Random randomNum = new Random();
			return randomNum.nextInt(choice - 1) + 1;
					
		}
//		private static int getDieValue2(int die2) {
//			return (int) ((Math.random()*6) + 1);
//			
//		}
}

//display the results of each die
//Ask the user if they want to roll again 
//Loop back to HERE
