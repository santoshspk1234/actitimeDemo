package Poly;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DebitCard c1=new DebitCard();
		SwipingMachine m1=new SwipingMachine();
		
		m1.swipeCard(c1);
		
		CreditCard c2=new CreditCard();
		m1.swipeCard(c2);
	}

}
