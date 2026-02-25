package inheritance;

public class SingleChild extends SingleParent {

		public void child()
		{
			System.out.println("From the child class");
		}
	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
				obj.parent();
				obj.child();
	}

}
