package inheritance;

public class HierarchialChildB extends HiererchialParent {
public void childB()
{
System.out.println("I am ChildB");	
}
	public static void main(String[] args) {
		
		HierarchialChildB obj= new HierarchialChildB();
		obj.parent();
		obj.childB();
	}

}
