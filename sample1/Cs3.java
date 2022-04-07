package sample1;

public class Cs3 {
int  a;
int b;
 long c;
 float d;
public Cs3(int num,int num1)
{
	a=num;
	b=num1;
	 c=a+b;
	System.out.println(c);
}
public Cs3(int num1, float value)
{
	a=num1;
	d=value;
	float c=a+d;

	System.out.println(c);

}
public Cs3(float num,int num3)
{
	d=num;
	c=num3;
	float a=d+c;
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cs3 j=new Cs3(45,12); 
Cs3 k=new Cs3(45,85f);
Cs3 f= new Cs3(78.12f,63);
Cs3 l=new Cs3(12.13f,12);
l.mul("raj");
	}
	public void mul( String name )
	{
		
		System.out.println(name);
				
	}
	

}
