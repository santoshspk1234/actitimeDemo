
public class HappyRecursion {

	public static void main(String[] args) {
		//int n=9089;

		for(int n=1; n<=100; n++)
		{
			int temp=n;
			while(n>9)
			{
				int sum=0;		
				while(n>0)
				{
					int ld=n%10;
					sum=sum+ld*ld;
					n=n/10;
				}
				n=sum;
			}	
//			if(n==1 || n==7)
//				System.out.println("Happy");
//			else
//				System.out.println("not happy");	
			
			if(n==1 || n==7)
				System.out.println(temp);
			n=temp;
		}	
	}
}
