package abstraction2;

public class AbstractionChild extends AbstracionParent {

	public static void main(String[] args) {
		AbstractionChild obj= new AbstractionChild();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		
		System.out.println("Hey buddy! I'am abstract method \uD83D\uDE80");
	}

}
