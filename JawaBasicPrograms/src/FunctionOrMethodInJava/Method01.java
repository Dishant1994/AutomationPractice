package FunctionOrMethodInJava;

public class Method01 {

	static void addTwoNum(int a,int b) {//int a=10, int b=20
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		//return;//java complier will write behalf of program
	}
	static void addTwoNum(int a,double b) {
		System.out.println("I Am Method 2 ");
		double res=a*b;
		System.out.println("res: "+res);
		
	}
	public static void main(String[] args) {	
		
		addTwoNum(10, 20);
		addTwoNum(100, 200);
		Method01.addTwoNum(101, 202);
		Method01.addTwoNum(110, 208);
		Method01.addTwoNum(210, 205);
		addTwoNum(10,10.0);
				
//		int x=10,y=20,res;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=100;
//		y=200;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=101;
//		y=202;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=105;
//		y=208;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
			
	}
}
