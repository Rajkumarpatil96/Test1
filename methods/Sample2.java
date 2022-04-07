package methods;

public class Sample2 {
	//Example for user defined constructor using parameter
	
		int num1;
		int num2;

public Sample2()//user defined  constructor with zero parameter 
{
	num1=80;
	num2=70;
	
}
public Sample2(int a,int b)//user defined constructor with two parameter
{
	num1=a;
	num2=b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Sample2 c =new Sample2();
c.add();
Sample2 c1=new Sample2(100,50);
c1.add();
	}
public void add()
{
	int sum=num1+num2;
	System.out.println("sum is "+sum);
}
}
