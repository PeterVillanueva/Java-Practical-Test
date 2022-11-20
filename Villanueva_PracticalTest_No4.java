package villanuevapackage;
import java.util.*;


public class Villanueva_PracticalTest_No4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Side of the Square: ");
		int side = scan.nextInt();
		
		int area = side*side;
		int perimeter = 4*side;
		
		System.out.println("Result:");
		System.out.printf("Area = " + area);
		System.out.printf("\nPerimeter = " + perimeter);
		scan.close();
		
	}

}
