package encapsultion;

public class Encap1 {
	private String name;
	private int rollnumber;
public void setter(String name, int rollnumber)
{
	this.name=name;
	this.rollnumber=rollnumber;
}
public void getter()
{
	System.out.println(name);	
	System.out.println(rollnumber);
}
}
