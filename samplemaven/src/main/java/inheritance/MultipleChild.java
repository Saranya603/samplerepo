package inheritance;

public class MultipleChild implements MultipleParent1, MultipleParent2 {

	public static void main(String[] args) {
		
		MultipleChild ob= new MultipleChild();
		ob.sub();
		ob.sum();
	}

	@Override
	public void sub() {
		int a= 3;
		int b= 2;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sum() {
		int a= 4;
		int b= 6;
		int c=a+b;
		System.out.println(c);
		
		
	}

}
