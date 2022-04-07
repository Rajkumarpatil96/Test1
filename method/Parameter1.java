package method;

import primitive.Primitive_demo;

public class Parameter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(45,85,55);
Parameter1 par= new Parameter1();
par.add1("keshav", 'A',77.90f);
Primitive_demo.all(); 
	}
	public static void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}
	public void add1(String name, char grade,float num)
	{
		System.out.println("name is "+name+ "\ngrade is" +grade +"\nnum is"+ num);
	}

}
