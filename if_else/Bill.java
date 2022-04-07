package if_else;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  TranscationID="MHB123456789";
int unit=1000;
float rate;


	

if(unit<=100)
{
	float bill=unit*2.5F;
	System.out.println("bill " +bill);
}

else if(unit>=100&unit<=200)
{
	float bill=unit*5;
System.out.println("bill is" +bill);	
}else if(unit>200&unit<=300)
{
int bill=unit*10;
System.out.println("Bill of that transcation ID is"+bill);
}else if(unit>=300)
{
	float  bill=unit*15;
	System.out.println("bill of that transcation Id is "+bill);

}else {
	System.out.println("enter the valid unit");
	
	
	
}
	}

}
