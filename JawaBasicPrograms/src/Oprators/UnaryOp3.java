package Oprators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0 , b ;
		b = a++ + ++a + ++a + a;
		System.out.println("Valu Of a = "+a);
		System.out.println("Valu Of b = "+b);
		
		a=0;
		b = a-- + --a + --a + a;
		System.out.println("Valu Of a = "+a);
		System.out.println("Valu Of b = "+b);
		
		
		System.out.println("***** Method Overriding*****");
		//Vehicle C1=new Vehicle();
		//C1.run();
		//Car2 C2=new Car2();
		//C2.run();
		System.out.println("***** Explicit *****");
		//Vehicle C3=(Vehicle)C4; compile time Error
		//C3.run();
		Vehicle C4=new Car2(); //Implicit up-casting
		Vehicle C3=(Vehicle)C4; // 
		C3.run();
		//C4=C3;
		C4.run();
	}

}
class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is moving");
	}
}
// Creating a child class
class Car2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}
}