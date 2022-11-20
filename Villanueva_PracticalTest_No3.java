package villanuevapackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Villanueva_PracticalTest_No3 {

	public static void main(String[] args) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		  
		 try {
			 
			System.out.print("Hey, my name is: "); 
		 	reader.readLine();
		 		
		 	System.out.print("and my roll number is: ");
		 	reader.readLine();
		 	
		 	System.out.print("My field of interest are: ");
		 	reader.readLine();
		 	
		 } catch (IOException e) {
			 System.out.print("error");
		 }	 				
	}
}
