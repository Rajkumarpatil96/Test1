package sample1;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//S2 h=new S2();//static method call from same class
//h.add();
S1 s=new S1();
s.k1();
	}
	public  void k1()
	{
		int a=10;
		int b=20;
		int Sum=a+b;
		//System.out.println("The sum of a&b is"+Sum);
		String StringValue = String.valueOf(Sum);
	System.out.println(StringValue +" kishor");//
	String s="20";
		int intvalue = Integer.parseInt(s);
	System.out.println(intvalue);
	intvalue=intvalue +30;
	System.out.println(intvalue);
	}
	


}
