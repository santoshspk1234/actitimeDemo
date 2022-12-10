package CollectionsCompareTo;

import java.util.ArrayList;
import java.util.Collections;
public class Driver {

	public static void main(String[] args) {

		
		ArrayList<Emp>a=new ArrayList<>();
		a.add(new Emp("asdf",5,50000.0));
		a.add(new Emp("qwer",2,30000.0));
		a.add(new Emp("zxcv",3,40000.0));
		
		for(Emp i:a)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		
		ArrayList<Emp>temp=a;
		
		for(Emp i:temp)
		{
			System.out.println(i);
		}
		System.out.println();
		
		Collections.sort(temp);
		
		for(Emp i:temp)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
