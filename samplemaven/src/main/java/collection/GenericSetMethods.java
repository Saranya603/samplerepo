package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>(); 
          s.add("Apple");
          s.add("Grapes");
          s.add("Orange");
        Set<String> s1=new HashSet<String>(); 
          s1.add("Watermelon");
          s1.add("Kiwi");
          System.out.println(s);
          System.out.println(s1);
          s.addAll(s1);
          System.out.println(s);
          System.out.println(s.contains("orange"));
          System.out.println(s.containsAll(s1));
          System.out.println(s.isEmpty());
           s1.iterator();
           System.out.println(s1);
           s.iterator();
           System.out.println(s);
           s.remove("Grapes");
           System.out.println(s);
           s.removeAll(s1);
           System.out.println(s);          
           System.out.println(s.size());
           s1.clear();
           System.out.println(s1);
	}


}
