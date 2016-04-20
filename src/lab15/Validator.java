package lab15;
import java.util.Scanner;
public class Validator {

	
		public static int getInt(String prompt, Scanner scan)
		{
			int q = 0;
			while(true)
			{
				System.out.println(prompt);
			if(scan.hasNextInt())
			{
				q = scan.nextInt();
				scan.nextLine();
				return q;
			}
				scan.nextLine();
				System.out.println("\nInvalid entry! You must enter a number!");
			}
			
		}

		public static int getIntWithinRange(String prompt, Scanner scan, int min, int max) {
			int input = 0;
			while(true)
			{
			input = getInt(prompt, scan);
			if(input < min)
				System.out.println("\nPlease enter a number between 1 and 3:");
			else if (input > max)
				System.out.println("\nPlease enter a number between 1 and 3:");
			else
				return input;
			}
		}
	}
