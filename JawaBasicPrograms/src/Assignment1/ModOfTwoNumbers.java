package Assignment1;

public class ModOfTwoNumbers {
	final double pi=3.14;
	static int A=10;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		int num1=25;
		int num2=15;
		int result=num1%num2;//mod
		System.out.println(" Number 1 is : "+num1);//25
		System.out.println(" Number 2 is : "+num2);//15
		System.out.println(" Mod of two number is : "+result);//
		System.out.println("******** Calling Non-Static Globle variable ********");
		ModOfTwoNumbers a1=new ModOfTwoNumbers();
		System.out.println("NSGV pi = "+a1.pi);
		System.out.println("******** Calling Static Globle variable ********");
		System.out.println("SGV A = "+A); //or
		//System.out.println("SGV A = "+ModOfTwoNumbers.A);
	}

}
