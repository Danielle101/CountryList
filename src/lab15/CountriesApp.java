package lab15;
//This app allows you to create,read, and write to a text file
import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		CountriesTextFile textFile = new CountriesTextFile();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		// welcome message and  menu prompt for user
		System.out.println("Welcome to the Countries Maintenance Application!\n");
		System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
	
		while(true)
		{
			//ask for user entry and validates that entry is withing range
		choice = Validator.getIntWithinRange("Please select a number from the menu (1/2/3):", scan, 1, 3);
		switch(choice)
		{
		case 1:
			textFile.makeFileReader();
			textFile.readCountries();
			textFile.closeRead();
			break;
		case 2:
			textFile.makeFileWriter();
			textFile.writeCountries("Enter the country you would like to add:");
			textFile.closeWrite();
			break;
			//exits the program
		case 3:
			System.out.println("Buh-bye");
			System.exit(0);;
		default:
			//
		}
		}
		
	}

}