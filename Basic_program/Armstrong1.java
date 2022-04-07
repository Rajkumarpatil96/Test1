package Basic_program;
import java.util.Scanner;
public class Armstrong1 {

	public static void main(String[] args) {
		int Armstrong=0;int n;int count=0;
		Scanner c=new Scanner(System.in);
		System.out.println(" Enter the number");
		n=c.nextInt();
		int A=n;
		while(A!=0)
		{
			count=count+1;
			A=A/10;
		}
		int B=n;
		
		while(B!=0)
		{int mul=1;
			int rem=B%10;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			Armstrong=Armstrong+mul;
			B=B/10;
		}
		if(Armstrong==n)
		{
			System.out.println("Given number is Armstrong number");
		}else
		{
			System.out.println("given number is non Armsstrong");
		}
	}

}
