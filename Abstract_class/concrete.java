package Abstract_class;

public class concrete extends Abstract1 {

	public static void main(String[] args) {
		concrete c=new concrete();
		c.test1();
		c.test();
	}

	@Override
	public void test1() {
		System.out.println("incomplete method of abstract class complete in concrete class");
		
	}

}
