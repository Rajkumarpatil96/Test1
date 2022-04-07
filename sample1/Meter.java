//Write a java program the reads a number in inches,converts it to meters .note 1 inch=0.0254,input is given 1000.
package sample1;
import java.util.Scanner;
public class Meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("Enter the value in inch");
double inch=input.nextDouble();
double meter=(inch*0.0254);
System.out.println("value in meter is "+meter +"m");

	}
}