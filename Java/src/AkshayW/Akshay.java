package AkshayW;

public class Akshay {
	public static void main(String[] args) {
		int []a= {5,4,6,3,2};
		int smallest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("smallest num is "+smallest);
	

	}
}
