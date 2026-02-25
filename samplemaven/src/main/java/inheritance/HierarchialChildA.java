package inheritance;

public class HierarchialChildA extends HiererchialParent {
public void childA()
{
System.out.println("I am heirarchial ChildA");	
}
	public static void main(String[] args) {
		HierarchialChildA obj= new HierarchialChildA();
        obj.parent();
		obj.childA();
	}

}
