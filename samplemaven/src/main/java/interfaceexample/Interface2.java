package interfaceexample;

public class Interface2  implements Interface1 {

	public static void main(String[] args) {
		/*Interface2 obj=new Interface2();
        obj.sum();
        obj.sub();
        obj.display();*/
		
		
		//reference creation
        Interface1 ob= new Interface2(); 
        ob.sum();
        ob.sub();
        
	}

	@Override
	public void sum() {
		
		int a=3;
		int b=4;
		int c= a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		int a=3;
		int b=2;
		int c=a+b;
		System.out.println(c);
		
		}
	public void display()
	{
		System.out.println("interface child class");
	}
}
