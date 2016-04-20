package lab15;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class CountriesTextFile {
		BufferedWriter bWriter;
		Scanner scan;
		FileReader fileReader;
		BufferedReader bReader;
		FileWriter fileWriter;
		PrintWriter printWriter;
		
		
		public CountriesTextFile()
		{
			scan = new Scanner(System.in);		
		}
		
		public void readCountries() throws IOException
		{
			String line = "";
			try{
			while ((line = bReader.readLine()) != null)
			{
				System.out.println(line);
			}
			}
			catch(NullPointerException e){
				System.out.println("no output found");
			}
		}
		
		public void makeFileReader() throws IOException
		{
			while(true)
			try {
				fileReader = new FileReader("countries.txt");
				bReader = new BufferedReader(fileReader);
				break;
			} catch (FileNotFoundException e) {
				makeFileWriter();
				closeWrite();
				
			}
		}
		
		public void makeFileWriter() throws IOException
		{
			while(true)
			try {
				fileWriter = new FileWriter("countries.txt", true);
				bWriter = new BufferedWriter(fileWriter);	
				printWriter = new PrintWriter(bWriter);
				break;
			} catch (IOException e) {
				System.out.println("Error!");
				File file = new File("countries.txt");
				fileWriter = new FileWriter(file, true);
				bWriter = new BufferedWriter(fileWriter);	
				printWriter = new PrintWriter(bWriter);
			}
		}
		
		public void writeCountries(String prompt) throws IOException
		{
			System.out.println(prompt);
			printWriter.println(scan.nextLine());
			
		}
		
		public void closeWrite() throws IOException
		{
			printWriter.close();
		}
		
		public void closeRead() throws IOException 
		{
			bReader.close();
		}
		
		
	}
