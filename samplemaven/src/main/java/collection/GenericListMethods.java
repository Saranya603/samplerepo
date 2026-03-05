package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {
	
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		
		l.add("red");
		l.add("blue");
		l.add("green");
		l.add("yellow");
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1, "black");
		System.out.println(l);
        System.out.println(l.indexOf("green"));
        System.out.println(l.lastIndexOf("red"));
        l.remove(2);
        System.out.println(l);
        System.out.println(l.contains("red"));
        System.out.println(l.isEmpty());
        l.size();
        System.out.println(l.size());
	}

}
