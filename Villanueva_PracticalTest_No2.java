package villanuevapackage;
import javax.swing.*;

public class Villanueva_PracticalTest_No2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Please Input the Length and Breadth of the rectangle.");
		
		double num = 0;
		double num1 = 0;
		double area;
		
		System.out.printf("Input:");
		num = Double.parseDouble(JOptionPane.showInputDialog ("Enter the Length of the rectangle: "));
		System.out.print("\nLength of the rectangle: " + num + "cm");
		num1 = Double.parseDouble(JOptionPane.showInputDialog ("Enter Breadth of the rectangle: "));
		System.out.print("\nBreadth of the rectangle: " + num1 + "cm");		
		area = num * num1;
		
		System.out.printf("\nResult: ");
		System.out.println("\nThe Area is: " + (int)area + "cm");
		JOptionPane.showMessageDialog(null,"Area of the Rectangle: " + (int)area,"Result",JOptionPane.INFORMATION_MESSAGE);	
		System.exit(0);
	}

}
