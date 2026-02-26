package aggregation;

public class Child {
	String city;
	String state;
	Parent ref;
public Child(String city, String state, Parent ref)
{
this.city= city;
this.state= state;
this.ref= ref;
}
public void print()
{
System.out.println(city);	
System.out.println(state);
System.out.println(ref.name);
System.out.println(ref.rollnumber);
System.out.println(ref.address);
}
public static void main(String[] args) {
	Parent obj1= new Parent("Saranya", 23, "Pournami");
	Child obj= new Child("varkala", "kerala", obj1);
    obj.print();
      
	}

}
