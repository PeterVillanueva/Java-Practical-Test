package villanuevapackage;
import javax.swing.*;

public class Villanueva_PracticalTest_No1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello User ! \nPlease Input two numbers.", "Greeting Message", JOptionPane.INFORMATION_MESSAGE);
		
		int num=0;  
		int num1=0; 
		int add;
		int multiply;
		
		System.out.printf("Input:");		
			num = Integer.parseInt (JOptionPane.showInputDialog ("Enter 1st number: "));
			System.out.print("\n1st number: " + num);
			num1 = Integer.parseInt (JOptionPane.showInputDialog ("Enter 2nd number: "));
			System.out.print("\n2nd number: " + num1);    
			add = num + num1; 
			multiply = num * num1;
		   
		System.out.printf("\nResult: ");
	    System.out.print("\nSum of two numbers: " + add);
	    System.out.print("\nProduct of two numbers: " + multiply);
	    JOptionPane.showMessageDialog(null,"Sum of two numbers: "  + add + "\n" + "Product of two numbers: " + multiply, "Result", JOptionPane.INFORMATION_MESSAGE);    
	    System.exit(0);
	}

}
