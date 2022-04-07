package upcasting;

public class son extends Father {

	public static void main(String[] args) {
		son c=new son();
		c.bike();
		Father f=new son();
		f.money();
		//f.bike();

	}
public void money()//override
{
	System.out.println("sons money");
}
public void bike()
{
	System.out.println("sons bike");
}
}
