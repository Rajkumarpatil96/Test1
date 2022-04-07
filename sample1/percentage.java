package sample1;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.println("enter the value of sub1");
int sub1 = input .nextInt();


System.out.println("enter the value of sub2");

int sub2=input. nextInt();

int total=sub1+sub2;
System.out.println("total is "+total);
int percentage= total*100/(200);


System.out.println("percentage"+percentage);
	}

}
