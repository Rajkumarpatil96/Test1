package Basic_program;

import java.util.Scanner;

//import.java.util.Scanner;
public class Armstrong_no {

	public static void main(String[] args) {
		int Armstrong=0;//153---1*1*1+5*5*5+3*3*3
		//int count=0;
		Scanner c=new Scanner(System.in);
		System.out.println("enter the number");
		int n=c.nextInt();
		int Z=n;
		for(;0<n;n=n/10)//15
		{
		
			int	r=n%10;//3,5,1
		
		  Armstrong=Armstrong+r*r*r;//351
			
		}
	if(Armstrong==Z)
	{
		System.out.println("given no is armstrong");
	}else
	{
		System.out.println("given no is non Armstrong");
	}
	}

}
