//write a java program Decimal to Hexadecimal by using hexstring method
package sample1;
import java.util.Scanner;
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the decimal number");
int decimal=input.nextInt();
String str=Integer.toHexString(decimal);
System.out.println("ans in hexadecimal "+str);
	}

}
