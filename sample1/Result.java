package sample1;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter your mark");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
if(a>35) {
	System.out.println("your result is pass");
	
	}
if(a<35) {
	System.out.println("your result is fail");
	
}
	}

}
