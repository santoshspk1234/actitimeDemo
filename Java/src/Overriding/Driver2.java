package Overriding;

public class Driver2 {

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		a1.talks();		//Animal talks....!
		
		Dog d1=new Dog();
		d1.talks();		//Dog barks....!!
		
		Animal a2=new Dog();	//Upcasting
		a2.talks();		//Dog barks....!!
		
		Tiger t1=new Tiger();
		t1.talks();		//Tiger Roars....!!
		
		Animal a3=new Tiger();	//Upcasting
		a3.talks();		//Tiger Roars....!!
		
		Dog d2=(Dog)a2;	//Downcasting
		d2.talks();		//Dog barks....!!
		
		Tiger t2=(Tiger)a3;	//Downcasting
		t2.talks();		//Tiger Roars....!!
		
		//Dog d3=(Dog)a3;	//Downcasting	//ClassCastException
		
	}

}
