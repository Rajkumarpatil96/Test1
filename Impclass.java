
public class Impclass implements interface1,interface2{

	public static void main(String[] args) {
		Impclass i=new Impclass();
		i.bike();
		i.money();
		interface1.test();
		interface2.test();

	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		interface1.super.money();
		interface2.super.money();
	}

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		interface2.super.bike();
		interface1.super.bike();
	}

}
