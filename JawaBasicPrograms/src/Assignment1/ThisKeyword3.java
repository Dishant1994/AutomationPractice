package Assignment1;

class A10 {
	A10() {
		this(10);
		System.out.println("hello zero");
	}
	A10(double d) {
		
		System.out.println("hello double " + d);
	}
	A10(int x) {
		this(25.36);
		System.out.println("Hello int " + x);
	}
}
class ThisKeyword3 {
	public static void main(String args[]) {
		 A10 a1=new A10();
//		 A10 a2=new A10(10);
//		 A10 a3=new A10(10.23);
	}
}

/**
 * this()---> statement
 * this(): used to call another constructor of current class based on its argument
 * this(): should be the first statement inside the constructor body
 * this(): should be used only in constructor
*/