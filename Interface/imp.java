package Interface;

public class imp  implements Interface1,Interface2{

	public static void main(String[] args) {
		imp p=new imp();
		p.m();
		p.m1();
		p.m2();
		p.m3();
		Interface1.m4();
		Interface2.m4();
		System.out.println(Interface1.a);

	}

	@Override
	public void m() {
		System.out.println("methiod pf interface 2 complete in imp class");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method of interface complete in imp class  ");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method of interface complete in imp class  ");
		
	}

	@Override
	public void m3() {

		Interface1.super.m3();
		Interface2.super.m3();
	}

}
