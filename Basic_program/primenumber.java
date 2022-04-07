package Basic_program;

public class primenumber {

	public static void main(String[] args) {
		int num=12;int count=0;
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("given number is prime number");
		}else
		{
			System.out.println("it is not a prime number");
		}
	}

}
