package collection;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		for(int b:a)
		{
			System.out.println(b);
		}
     List <String> l=new ArrayList<String>();
      l.add("apple");
      l.add("Mango");
      for(String x:l)
      {
    	  System.out.println(x);
      }
	}

}
