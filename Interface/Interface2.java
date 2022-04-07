package Interface;

public interface Interface2 {
void m();
default void m3()
{
	System.out.println("m3 method of Interface2");
}
static void m4()
{
	System.out.println("static method of interface2");
}
}
