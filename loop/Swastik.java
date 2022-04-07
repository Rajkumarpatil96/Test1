package loop;

public class Swastik {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{if( i==(n+1)/2 ||(j==(n+1)/2 ))//||(j==1&&i<=(n+1/2) ||(j==5&&i>=(n+1/2)) ))
			{
				System.out.print("* ");
			}
			
				
			}
			System.out.println();
//			for(int j=3;j<=5;j++)
//			{
//				System.out.print("* ");
//				
//			}
			//for
			//System.out.println();
//		}
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j<=5;j++)
//			{
//				System.out.print("* ");
//				
//				
//			}
//			System.out.println();
		}

	}


}