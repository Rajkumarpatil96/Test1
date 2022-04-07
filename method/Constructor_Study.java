package method;

public class Constructor_Study {
	public Constructor_Study()//calling constructor zero parameter
	{
		int a=45;
		int b=76;
		int sum =a+b;
		System.out.println("sum of a&b is "+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor_Study obj=new Constructor_Study();
obj.mul(45, 40);//calling same class non static method
obj.mul(12, 10);//calling same class non static method 
obj.mul(10, 100);//calling same class non static method
Sample1 G=new Sample1();
G.meth1();//calling another class non static method
	}
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication of a&b is "+c);
	}

}
