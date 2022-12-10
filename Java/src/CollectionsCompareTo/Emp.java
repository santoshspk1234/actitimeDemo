package CollectionsCompareTo;

public class Emp implements Comparable
{
	String name;
	int eid;
	double salary;
	
	public Emp(String name, int eid, double salary) 
	{
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name+" eid is "+eid+" salary is "+salary;
	}
	
	
	public int compareTo(Object obj)
	{
		if(this.salary==((Emp)obj).salary)
		{
			return 0;
		}
		else if (this.salary>((Emp)obj).salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
}
