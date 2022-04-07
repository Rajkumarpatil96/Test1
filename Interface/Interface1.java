package Interface;

public interface Interface1 {
int a=10;
void m1();
void m2();
default void m3() {
	System.out.println("m3 by default method");
	
}
 static void m4()
{
	System.out.println("m4 static interface");
}
}
