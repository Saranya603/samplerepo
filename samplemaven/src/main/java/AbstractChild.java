
public class AbstractChild extends AbstractionParent{

	public static void main(String[] args) {
		AbstractChild obj= new AbstractChild();
		obj.display();
		obj.sum();

	}

	@Override
	public void sum() {
		int a=11;
		int b=35;
		int c=a+b;
	System.out.println(c);	
	}

}
