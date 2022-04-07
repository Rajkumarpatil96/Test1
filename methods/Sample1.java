//Static method calling in same class
package methods;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
meth();//calling static method in same class 
Sample1 ob=new Sample1();
ob.meth1();//non static method calling same class
	}
public static void meth()//static method
{
	int num=56;
	String name="Rajkumar";
	char Grade='A';
	float dec=45.12f;
	System.out.println("num is "+num +"\n name is "+name +"\n Grade is "+Grade +"\n dec is"+dec);
}
public void meth1()//non static method
{
	long Acc_no=12365478946544l;
	String name= "sayaji";
	String bloodGroup="AB+";
	System.out.println("account no is "+Acc_no +"\n name is "+name+"\n bloodGroup is "+bloodGroup);
}
}
