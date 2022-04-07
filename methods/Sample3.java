package methods;

public class Sample3 {
	int value;
	int value1;
	int value2;
	public Sample3()
	{
		
	}
	public Sample3(int a, int b,int c )//user defined with three parameter
	{
		value=a;
		value1=b;
		value2=c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample3 ob=new Sample3();
ob.mul(45,10,1);
	}
	public void mul()
	{
		int mul=value*value1*value2;
		System.out.println("multiplication of three num is"+mul);
	}

}
